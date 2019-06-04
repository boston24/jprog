package Lab6

object Zad2 extends App {

  val seq = Seq[Int](1, 3, 5)
  val seq2 = Seq[Int](1, 3, 5, 6, 7)

  def applyForAll2[A,B,C](seq: Seq[A], seq2: Seq[B], f: (A, B) => C): Seq[C] = {
    def helper(seq: Seq[A], seq2: Seq[B], f: (A, B) => C, out: Seq[C]): Seq[C] = (seq,seq2) match {
      case (a +: b, a2 +: b2) => helper(seq.tail,seq2.tail,f,out :+ f(a,a2))
      case (_,_) => out
    }
    helper(seq,seq2,f,Seq())
  }

  println(applyForAll2[Int,Int,Int](seq,seq2,(n,m) => n+m))

}
