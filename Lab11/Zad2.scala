package Lab11

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

object Zad2 extends App {

  case class Wyslij(a: Double, b: Double, c: Double, serwer: ActorRef)
  case class Sprawdz(a: Double, b: Double, c: Double)


  class Klient extends Actor {
    def receive: Receive = {
      case Wyslij(x,y,z,serwer) => serwer ! Sprawdz(x,y,z)
    }
  }

  class Serwer extends Actor {
    def receive: Receive = {
      case Sprawdz(x,y,z) => if(x+y > z && y+z > x && z+x > y) println("true")
      else println("false")
    }
  }



  val system = ActorSystem()
  val sendS = system.actorOf(Props[Serwer])
  val sendK = system.actorOf(Props[Klient])


  sendK ! Wyslij(100,2.5,8,sendS)

}
