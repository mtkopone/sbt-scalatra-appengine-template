import org.scalatra.test.specs.ScalatraSpecification
import org.specs.mock.Mockito

class ExampleServletSpec extends ScalatraSpecification with Mockito {

  "Example servlet" should {

    val dao = mock[Dao]
    addServlet(new ExampleServlet(dao), "/*")

    "say hello" in {
      get("/") {
        status mustEqual 200
        body mustEqual "<h1>Hello, appengine!</h1>"
      }
    }
    "return mocked user" in {
      dao.user returns "mocked-user"
      get("/user") {
        body mustEqual "mocked-user"
      }
      there was one(dao).user
    }
  }

}