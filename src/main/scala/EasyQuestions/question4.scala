package EasyQuestions

//Проверить номер кретки алгоритмом Луна
//Сумма чисел кредитки, каждое нечётное*2, если больше 9 то -9.
//Общая сумма должна быть кратна 10

object question4 extends App{

  def split(n: BigInt): List[BigInt] = if (n == 0) List(0) else {
    (Stream.iterate(n)(_/10)takeWhile(_!=0)map(_%10)toList) reverse
  }
  def lune (x:BigInt):Boolean = {
    val even =  split(x).drop(1).sliding(1, 2).flatten.toList.sum
    val odd = split(x).sliding(1, 2).flatten.toList.map(_*2).map(n=> if (n>9) (n-9) else n).sum
    val sum = even + odd
    if (sum%10==0) true else false
  }
}
