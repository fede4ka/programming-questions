package VeryEasyQuestions

//Определить палиндром (симметричное число, 2332)

object question9 extends App{
  def pal (a:Int):Boolean = {
    a.toString==a.toString.reverse
  }
}
