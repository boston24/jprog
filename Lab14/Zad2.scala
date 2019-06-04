package Lab14

import akka.actor.{ActorSystem, Props, Stash}

object Zad2 extends App {

  case class Odbierz(wiadomosc: String)

  class Nadzorca extends App with Stash {
    def receive: Receive = {
      case Odbierz(x) if(x!="zmien") => stash()
      case Odbierz("zmien") => unstashAll()
      context.become(trans)
    }

    def trans: Receive = {
      case Odbierz("zmien") => context.become(receive)
      case Odbierz(x) if(x!="zmien") => println(s"było: $x")
    }

  }

  val system = ActorSystem("sys")
  val worker = system.actorOf(Props[Nadzorca],"worker")

  worker ! Odbierz("halo")
  worker ! Odbierz("halo")
  worker ! Odbierz("halo")
  worker ! Odbierz("zmien")
  worker ! Odbierz("zmien")
}
