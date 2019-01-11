package VeryEasyQuestions

//сгенерировать лист из 50 чисел от 1до10, отсортировать по убыванию, возростанию, частоте

object question5 extends App {
  import scala.collection.immutable.ListMap

  val r = new scala.util.Random
  val a = for (i <- 1 to 55) yield r.nextInt(11)
  val desc = a.sortWith(_>_)
  val asc = a.sortWith(_<_)

  val ma = ListMap(a.groupBy(identity)
    .toSeq.sortWith(_._2.size < _._2.size):_*)
    .values
    .toVector
    .flatten
  val md = ListMap(a.groupBy(identity)
    .toSeq.sortWith(_._2.size > _._2.size):_*)
    .values
    .toVector
    .flatten

  println(s"$asc \n $desc \n $ma \n $md")
}
