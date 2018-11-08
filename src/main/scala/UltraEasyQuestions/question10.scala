package UltraEasyQuestions

//Generate 100 random integers, each between 0 and 100
//Enter a number and check if it is in the list

object question10 extends App {
  val r = new scala.util.Random
  val list = for (i <- 1 to 100) yield r.nextInt(100)
  println("Enter a number (0-100) ")
  val input = scala.io.StdIn.readLine().toInt
val Boolean = list.contains(input)
if (Boolean) { println ("Number is in the list")}
else {println ("Number is not in the list")}
println(list)
}
