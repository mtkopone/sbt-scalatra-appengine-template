import org.mortbay.jetty.Server
import org.mortbay.jetty.webapp.WebAppContext

object EmbeddedJetty {
  def main(args: scala.Array[String]) {
    val server = start()
    println(">>> Jetty started. PRESS ANY KEY TO STOP")
    while (System.in.available() == 0) Thread.sleep(5000)
    server.stop()
    server.join()
  }

  def start(port: Int = 8080) = {
    val server = new Server(port)
    val context = new WebAppContext()
    context.setServer(server)
    context.setContextPath("/")
    context.setWar("src/main/webapp")
    server.addHandler(context)
    server.start()
    server
  }
}