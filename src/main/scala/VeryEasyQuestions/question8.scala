package VeryEasyQuestions

//склеить 2 числа используя только мат.методы

object question8 extends App{
  def conc (a:Int, b:Int):Int = {
    if (b<10 && b>=0 ) return a*10 + b
    if (b>10 && b<100) return a*100 + b
    if (b>100 && b<1000)  a*1000 + b
    else 0
  }
}
