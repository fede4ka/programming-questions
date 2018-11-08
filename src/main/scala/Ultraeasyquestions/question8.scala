package UltraEasyQuestions

//generate 3 random integers, each between 0-20. Find the smallest, largest and the average of the three.

object question8 extends App {
  val r = new scala.util.Random
  val list = for (i <- 1 to 3) yield r.nextInt(40)
  println("random integers is")
  list foreach(println)
  val max = list.max
  val min = list.min
  val average = list.sum/3
  print(s"Max is $max , min is $min, average is $average.")
}
