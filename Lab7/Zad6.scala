package Lab7

object Zad6 extends App {

  val napis = "marmolada"

  def countChars(str: String): Int = str.groupBy(c => c).size

  println(countChars(napis))

}
