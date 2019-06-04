package Lab12

import akka.actor.{ActorSystem, Actor, ActorRef, Props}

class MyActor extends Actor {
  def receive: Receive = {
    case msg => println(s"Odebrałem wiadomość: $msg")
  }
}

object Main extends App {
  def dane(): List[String] = {
    scala.io.Source.fromResource("ogniem_i_mieczem.txt").getLines.toList
  }
  val system = ActorSystem("HaloAkka")
  val leonardo = system.actorOf(Props[MyActor], "leonardo")
  leonardo ! "Dostałeś Oskara!"

  println(dane())

}
