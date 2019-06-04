package Lab14

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

object Zad4 extends App {

  case class Init(liczbaPracownikow: Int)
  case class Silnia(n: Int)
  case object Koniec

  class Nadzorca extends Actor {
    val pracownicy: Seq[ActorRef] = Seq()
    def receive: Receive = {
      case Init(n) =>{
        val pracownicy = for{
          i <- 1 to n
          pracownik = system.actorOf(Props[Pracownik], name = s"p$n")
        } yield pracownik
        for (i <- 1 to n) {
        pracownicy(i-1) ! Silnia(i)
        pracownicy.foreach(x => context.watch(x))
        }
      }

      case Koniec => pracownicy.foreach(x => context.unwatch(x))
        println("Zakonczono proces")
        context.stop(self)

    }
  }

  class Pracownik extends Actor {
    def silnia(n: Int, wynik: Int = 1): Int = {
      n match {
        case 1 => wynik
        case _ => silnia(n-1, wynik*n)
      }
    }
    def receive: Receive = {
      case Silnia(x) => println(x + "! = " + silnia(x))
        system.terminate()
        sender ! Koniec
    }
  }

  val system = ActorSystem("sys")
  val worker = system.actorOf(Props[Nadzorca],"worker")

  worker ! Init(5)


}
