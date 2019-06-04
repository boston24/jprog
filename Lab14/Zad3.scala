package Lab14

import akka.actor.{Actor, ActorSystem, Props}

object Zad3 extends App {

  case class Wynik(liczba1: Double, liczba2: Double)
  case object Zmien

  class Pracownik extends Actor {
    def receive: Receive = {
      case Wynik(a,b) => println(a+b)
      case Zmien => context.become(Mnozenie)
    }

    def Mnozenie: Receive = {
      case Wynik(a,b) => println(a*b)
      case Zmien => context.become(receive)
    }

  }


  val system = ActorSystem("sys")
  val worker = system.actorOf(Props[Pracownik],"worker")

  worker ! Wynik(2.5,4.2)
  worker ! Zmien
  worker ! Wynik(2.5,4.2)


}
