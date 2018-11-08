package UltraEasyQuestions

//one test and a optional project
//if u score below 50 - u got F, 50-69 - C, 70-89 - B, 90-100 is A
//if u submit the optional project u raise your grade by one letter.
//Let the user input their marks (0-100) and whether they submit the project (y/n) and give them their grade.

object question9 extends App {
  println("Enter your score (0-100)")
  val score = scala.io.StdIn.readLine().toInt
  println("Did u submit the optional project? Y/N")
val proj = scala.io.StdIn.readLine()
val result = (score, proj)
  result match {
    case (x,"n") =>
      if (x <50)         println("F")
      if (x >50 && x<69) println("C")
      if (x >70 && x<90) println("B")
      if (x >89)         println("A")
    case(x,"y")=>
      if (x <50)         println("C")
      if (x >50 && x<69) println("B")
      if (x >70 && x<90) println("A")
      if (x >89)         println("A")
    case(_)=> println("Error")
  }
}
