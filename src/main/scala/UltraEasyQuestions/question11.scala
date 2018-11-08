package UltraEasyQuestions
//Higher/Lower (1 to 100)
object question11 extends App {
  val r = new scala.util.Random
  val a =r.nextInt(100)
  println(a)
  println("Higher or Lower? h/l")
  val input = scala.io.StdIn.readLine()
  val b = r.nextInt(100)
  println(b)
input match {
  case "h" => if (b>a) println("Winner!") else println("Loose!")
  case "l" => if (b<a) println("Winner!") else println("Loose!")
  case _ =>  println("wat?")
}
}
