package Lab5

object Zad2 extends App {

  val seq = Seq[Int](2,4,6,8,10,12)

  def insertInto[A](a: A, seq: Seq[A])(leq: (A,A) => Boolean ): Seq[A] = {
    def helper[A](a: A, seq: Seq[A], out: Seq[A], check: Boolean = false)(leq: (A,A) => Boolean): Seq[A] = {
      seq match{
        case Seq() => out
        case _ if (check) => helper(a, seq.tail, out :+ seq.head, true)(leq)
        case _ if (seq.length==1 && !leq(a, seq.head)) =>  helper(a, seq.tail, out :+ seq.head :+ a, true)(leq)
        case _ if (leq(a, seq.head)) => helper(a, seq, out :+ a, true)(leq)
        case _ if (!leq(a, seq.head)) => helper(a, seq.tail, out :+ seq.head, false)(leq)
      }
    }
    helper(a,seq,Seq())(leq)
  }

  println(insertInto(5,seq)((n,m) => n<=m))

}