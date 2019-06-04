package Lab4

object Zad6 extends App {

  val seq = Seq[Int](1,3,5,8)
  val seq2 = Seq[Int](2,4,6,8,10,12)

  def merge[A](a: Seq[A], b: Seq[A])(leq: (A,A) => Boolean): Seq[A] = {
    def helper(a: Seq[A], b: Seq[A], out: Seq[A])(leq: (A,A) => Boolean): Seq[A] = (a,b) match {
      case (Seq(),Seq()) => out
      case (Seq(),head+:_) => helper(Seq(),b.tail,out:+b.head)(leq)
      case (head+:_,Seq()) => helper(a.tail,Seq(),out:+a.head)(leq)
      case (head+:_,head2+:_) => if(leq(a.head,b.head)) helper(a.tail,b,out:+a.head)(leq)
                                  else helper(a,b.tail,out:+b.head)(leq)
    }
    helper(a,b,Seq())(leq)
  }

  println(merge(seq,seq2)((m,n) => m < n))

}
