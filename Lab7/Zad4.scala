package Lab7

object Zad4 extends App {

  val seq = Seq(1, 1, 2, 4, 4, 4, 1, 3)

  def remElems[A](seq: Seq[A],k: Int): Seq[A] = {
      seq.zipWithIndex.filter((pair: (A,Int)) => pair._2!=k).map(pair => pair._1)
  }

  println(remElems(seq, 4))

}
