package Lab7

object Zad2 extends App {

  var seq = Seq(-5.0,2.8,-3.9,-4.0,18.78,2,49,0.0)

  def pairPosNeg(seq: Seq[Double]): (Seq[Double],Seq[Double]) = {
    seq.filter((n) => n!=0.0).partition((n)=> n>0.0)
  }

  println(pairPosNeg(seq))

}
