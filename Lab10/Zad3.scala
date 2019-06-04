package Lab10

import scala.io.Source


object Zad3 extends App {

  val nazwa: Seq[Int] = Source.fromFile("C:\\Users\\matij\\Documents\\STUDIA\\Semestr 2 (Scala,SQL)\\Języki programowania\\Laboratoria\\src\\main\\scala\\Lab10\\liczby.txt").getLines.toList.map((s: String) => s.toInt)

  println(nazwa.partition((x) => x%2==0))

}
