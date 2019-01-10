package VeryEasyQuestions

//Даны сумма денег, процент и число лет. Расчитать остаток на счёте, проценты начисляются ежегодно.

object question4 extends  App {
  def go (start:Double, interest:Double, y:Int):Double = {
    val a = start * interest
    if (y <= 1) a-(a%0.01) else go(a, interest, y - 1)
  }
  println("Введите сумму ")
  val summa = scala.io.StdIn.readLine().toDouble
  println("Введите процент")
 val proc = (scala.io.StdIn.readLine().toDouble +100)/100
  println("Введите срок в годах")
val srok = scala.io.StdIn.readLine().toInt
print(go(summa,proc,srok))
}
