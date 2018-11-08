package UltraEasyQuestions

//print the 12x12 multiplication table

object question6 extends App{
  val a = for {x <- 1 to 12} yield List.range(1,13).map(n=>n * x)
  a foreach(println)
}
