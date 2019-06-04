package Lab11

import akka.actor.{Actor, ActorRef, ActorSystem, Props}

object Zad1 extends App {

  var count=10

  case object Ping
  case object Pong
  case class Graj(przeciwnik: ActorRef)

  class Nadzorca extends Actor{
    def receive: Receive ={

      case Graj(x) => println("start")
        x ! Ping

      case Ping =>
        if(count>0)
          println("Ping")
        count=count-1
        sender() ! Pong

      case Pong =>
        if(count>0)
          println("Pong")
        count=count-1
        sender() ! Ping

    }

  }

  val system = ActorSystem()
  val player1 = system.actorOf(Props[Nadzorca])
  val player2 = system.actorOf(Props[Nadzorca])

  player1 ! Graj(player2)

}
