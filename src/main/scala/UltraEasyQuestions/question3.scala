package UltraEasyQuestions

//sum all the integers from x to y (0 to 1000 for example)

object question3 extends App {
//1
  println( List.range(1,1001).foldLeft(0)(_+_))
//2
  println( List.range(1,1001).sum)
//3
  def sum (x:Int, y:Int):Int = {
    var buf:Int = 0
    for (a <- x to y) {buf+=a}
    buf
  }
  println(sum(0,1000))


}
