package UltraEasyQuestions

//Let the user input their name, and check if it is fede4ka. If so print "Zdrastvuy dorogoy, kak sam?"
// if no "Hello [Name]!"

object question4  extends App{
    println("Type Name : ")
    val input = scala.io.StdIn.readLine()
  if (input == "fede4ka") println("Zdrastvuy dorogoy, kak sam?")
  else println("Hello " + input +"!")
}
