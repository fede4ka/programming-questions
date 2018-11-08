package UltraEasyQuestions

//Count down from 700 to 200 in decrements of 13

object question2 extends App {
  //1
  for (i <- 700 to 200 by -13) println(i)
  //2
  def viaStream(number: Int): Stream[Int] = Stream.cons(number, viaStream(number - 13))
  viaStream(700).take(20).print
  //3
  val x = List.range(700,200,-13)
  //4
  val buf = new collection.mutable.ListBuffer[Int]
  for( a <- 700 to 200 by -13) {
    buf += a
  }
  print(buf.toList)
}
