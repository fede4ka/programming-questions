package UltraEasyQuestions

//label all the even and the odd numbers from 1 to 100
object question5 extends App {
  println("even")
  println (List.range (1, 100).filter(x=>x%2==0))
  println("odd")
  println (List.range (1, 100).filter(x=>x%2!=0))
}
