package EasyQuestions

//Массив из 100 рандомных чисел, выбирается одно от 0 до 98.
//Порядок ячеек от числа до 99 надо изменить

object question6 {
  val rnd  = for (i <- 1 to 100) yield scala.util.Random.nextInt(100)
  def reverseAfter (n:Int,ls:IndexedSeq[Int]):IndexedSeq[Int] = {
    val (a,b) = ls splitAt n
    a++b.reverse
  }
}
