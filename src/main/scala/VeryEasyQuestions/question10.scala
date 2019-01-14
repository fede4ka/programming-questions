package VeryEasyQuestions

//сумма 1000 простых чисел

object question10 extends  App{
  def isPrime(n: Int): Boolean = (2 to math.sqrt(n).toInt) forall (x => n % x != 0)
  val primes = 2 #:: Stream.from(3,2).filter(isPrime)
  print(primes.take(1000).sum)
}