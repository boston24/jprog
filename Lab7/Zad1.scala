package Lab7

object Zad1 extends App {

  var seq = Seq(1,2,3,4,5,6)

  def subseq[A](seq: Seq[A], begIdx: Int, endIdx: Int): Seq[A] = {
      seq.drop(begIdx).take(endIdx-begIdx)
  }

  println(subseq(seq,2,5))

}
