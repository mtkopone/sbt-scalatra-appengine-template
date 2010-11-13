import org.scalatra._

class ExampleServlet(dao: Dao) extends ScalatraServlet {
  def this() = this(Dao)
  
  get("/") {
    <h1>Hello, appengine!</h1>
  }
  get("/user") {
    dao.user
  }

}

trait Dao {
  def user: String
}

object Dao extends Dao {
  def user = "mtkopone"
}
