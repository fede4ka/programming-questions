package VeryEasyQuestions

//орёл и решка, 1000 раз, записать результат в процентах

object question3 extends App{
  val r = new scala.util.Random
  val a = for (i <- 1 to 1000) yield (r.nextInt(2),r.nextInt(2))
  val twoheads = a.count(_==(1,1))
  val twotails = a.count(_==(0,0))
  val headtail = a.filter(_ != (0,0)).count(_!= (1,1))
  println(s"twoheads = ${twoheads/10}% " +
    s"twotails = ${twotails/10}% " +
    s"headtail = ${headtail/10}%  ")
}
