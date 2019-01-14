package EasyQuestions

//Проверить слова на анаграмму(слово из тех же букв)

object question1 extends App{
  def isAnagram (w1:String,w2:String):Boolean = w1.toLowerCase.sorted == w2.toLowerCase.sorted
}
