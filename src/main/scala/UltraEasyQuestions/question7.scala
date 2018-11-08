package UltraEasyQuestions

//user will enter 10+ sentence of words as input. Split this sentence and display as one word per line

object question7 extends App{
  println("Enter the sentence of words pls ")
  val input = scala.io.StdIn.readLine()
input.split(" ").foreach(println)
}
