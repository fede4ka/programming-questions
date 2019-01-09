package VeryEasyQuestions

//Convert int (0-10000) to time in the format hh:mm:ss

object question2 extends App{

  println("Enter int ")
  val input:Int = scala.io.StdIn.readLine().toInt
  val hours:Int = if (input > 3599)  input / 3600 else 0
  val min:Int = if (input > 3599) (input % 3600) /60
  else if (input < 3600) input / 60
    else 0
val sec:Int = if (input<60) input
else input % 60

  print(s" $hours : $min : $sec.")

}
