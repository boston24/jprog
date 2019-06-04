package Lab8

object Zad2 extends App {

  val seq = Seq(2, 1, 1, 5)

  def position[A](seq: Seq[A], el: A): Option[Int] = {
    seq.zipWithIndex.filter((pair: (A,Int)) => pair._1 == el ).map(pair => pair._2).headOption
  }

  println(position(seq,5))

}
