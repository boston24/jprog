package Lab6

object Zad1 extends App {

  val seq = Seq[Int](2,4,6,8,10,12)

  def applyForAll[A,B](seq: Seq[A],f: A=>B): Seq[B] = {
    def helper(seq: Seq[A],f: A=>B,out: Seq[B]): Seq[B] = seq match {
      case Seq() => out
      case _ => helper(seq.tail,f,out :+ f(seq.head))
    }
    helper(seq,f,Seq())
  }

  println(applyForAll[Int,Int](seq, (n) => n+2 ).mkString("[", ", ", "]"))

}
