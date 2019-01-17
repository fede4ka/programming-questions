package EasyQuestions

object question8 extends App{

  val sticks = Array ((1 to 3).toList,Nil,Nil)
  println("===start===")
  for (p<-sticks) println(p)
  println("===start===")
  def move1disc(from:Int,to:Int):Unit = {
    require(sticks(to).isEmpty || sticks(from).head<sticks(to).head)
    sticks(to)::=sticks(from).head
    sticks(from) = sticks(from).tail
    println("=======1111========")
    for (p<-sticks) println(p)
  }

  def moveDiscs (from:Int,to:Int,n:Int):Unit = {
    if (n == 1) move1disc(from, to)
    else {
      val other = 3 - from - to
      moveDiscs(from, other, n - 1)
      move1disc(from, to)
      moveDiscs(other, to, n - 1)
      println("=======xxxx=========")
    }
  }
  for (p<-sticks) println(p)
  moveDiscs(0,2,3)
  for (p<-sticks) println(p)
  println("=====finish====")
}

