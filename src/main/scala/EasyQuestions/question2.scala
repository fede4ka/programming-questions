package EasyQuestions

//Разложить число на простые множители

object question2 extends  App {
  def isPrime(n: Int): Boolean = (2 to math.sqrt(n).toInt) forall (x => n % x != 0)
  val primes = 2 #:: Stream.from(3,2).filter(isPrime)

  def primeFactors(start:Int):List[Int] = {
    def primeFactorsR(n: Int, ps: Stream[Int]): List[Int] =
      if (isPrime(n)) List(n)
      else if (n % ps.head == 0) ps.head :: primeFactorsR(n / ps.head, ps)
      else primeFactorsR(n, ps.tail)
    primeFactorsR(start, primes)
  }

  print(primeFactors(228))
}
