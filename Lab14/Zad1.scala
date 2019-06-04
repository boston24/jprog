package Lab14

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

object Nadz {
  case class Odbierz(wiadomosc: String)
  case object Wyswietl
}

class Nadzorca extends Actor {
  def receive: Receive = {
    case Nadz.Odbierz(wiadomosc: String) => context.become(wyswietl(wiadomosc))
  }

  def wyswietl(wiadomosc: String): Receive = {
    case Nadz.Wyswietl => println(wiadomosc)
  }

}

object Zad1 extends App{

  val system = ActorSystem("sys")
  val nadzorca = system.actorOf(Props[Nadzorca],"nadzorca")
  nadzorca ! Nadz.Odbierz("Zabijcie mnie!")
  nadzorca ! Nadz.Wyswietl

}
