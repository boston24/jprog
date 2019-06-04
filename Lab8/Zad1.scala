package Lab8

object Zad1 extends App {

  def sum(seq: Seq[Option[Double]]): Double = {
    seq.foldLeft(0.0)((count,b)=>count+b.getOrElse(0.0))
  }

  println(sum(Seq(Some(5.4), Some(-2.0), Some(1.0), None, Some(2.6))))
}
