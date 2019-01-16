package EasyQuestions

//Дан массив из 10 чисел, проверить отсортирован ли он

object question3 extends App{
  def checkArray(x:Array[Int]):String = {
    if (x sameElements x.sortWith(_<_)) "ascending order"
    else if (x sameElements x.sortWith(_>_)) "descending order"
    else "not sorted"
  }

  println(checkArray(Array(1,2,3)))
  println(checkArray(Array(3,2,1)))

}
