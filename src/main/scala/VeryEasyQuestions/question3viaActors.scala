import akka.actor.{ ActorSystem, Props, Actor }

class counter extends Actor {
  var count = 0
  var hh = 0
  var tt = 0
  var ht = 0
  val coins = context.actorOf(Props[coins])
  def receive = {
    case "start" => coins ! "Flip"
    case c:(Int,Int)   if count<1000 => c match {
        case (1,1) => hh+=1; count+=1; coins ! "Flip"
        case (0,0) => tt+=1;count+=1; coins ! "Flip"
        case _ => ht+=1;count+=1; coins ! "Flip"
    }
    case _ => print(s"twoheads = ${hh/10}% " +
      s"twotails = ${tt/10}% " +
      s"headtail = ${ht/10}%  ")
  }
}

class coins extends Actor {
  def receive = {case "Flip" =>
    val r = new scala.util.Random
    sender() ! (r.nextInt(2),r.nextInt(2))
  }
}

object question3viaActors extends App {
  val system = ActorSystem("Coins")
  val counter = system.actorOf(Props[counter],"counter")
  counter ! "start"
  Thread.sleep(1000)
  system.terminate()
}

