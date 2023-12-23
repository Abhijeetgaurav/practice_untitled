import scala.io.StdIn
@main
def main(): Unit = {
  println("Hello world!")

  println("enter something")

  val newvar =  StdIn.readLine()
  println(s"i entered $newvar")
}