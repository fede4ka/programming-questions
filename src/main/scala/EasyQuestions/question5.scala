package EasyQuestions

//Определить количество цифр в числе

object question5 extends App{
import question4.split
  println("Type number : ")
  val input = scala.io.StdIn.readLine()
  print(split(BigInt (input)).size)
//дабы читать из комнадной строки BigInt надобно использовать этот конструктор из жавы
}
