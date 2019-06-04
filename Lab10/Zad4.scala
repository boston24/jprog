/*package Lab10

import scala.io.Source

object Zad4 extends App {

  val nazwa: Seq[Int] = Source.fromFile("C:\\Users\\matij\\Documents\\STUDIA\\Semestr 2 (Scala,SQL)\\Języki programowania\\Laboratoria\\src\\main\\scala\\Lab10\\cyfry.txt").getLines.toList.map((s: String) => s.toInt)

  //val nazwa = Seq(2,4,5,6,7,8)

  def result(seq: Seq[Int], sum: Int = 0): Int = seq match {
    case Seq() if(=> sum(seq.head < seq.tail.head) result (seq.tail, sum + 1)
  }

}
*/