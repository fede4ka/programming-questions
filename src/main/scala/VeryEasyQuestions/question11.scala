package VeryEasyQuestions

//Найти дубликат в массиве чисел.

object question11 extends App {
  val a = Array (1,2,2,3,4,5,6,7,8,9)
  val b = a.diff(a.distinct)
  print(b(0))
}
