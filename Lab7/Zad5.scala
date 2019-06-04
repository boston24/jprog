package Lab7

object Zad5 extends App {

  val seq = Seq('a','b','a','c','c','a')

  def freq[A](seq: Seq[A]): Map[A,Int] = {
    seq.groupBy(a => a).mapValues(a => a.size)
  }

  println(freq(seq))
  println(seq.groupBy(a => a))

}
