package Lab8

object Zad3 extends App {

  val seq = Seq(1, 2, 1, 1, 5)

  def indices[A](seq: Seq[A], el: A): Set[Int] = {
    seq.zipWithIndex.filter((pair: (A,Int)) => pair._1 == el ).map(pair => pair._2).toSet
  }

  println(indices(seq,7))

}
