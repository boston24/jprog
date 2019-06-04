package Lab6

object Zad4 extends App {

  val seq = Seq[Int](1,2,3,4)
  val seq2 = Seq("kota"," ","ma"," ","ala")

  def compute[A,B](seq: Seq[A])(init: B)(op: (A,B) => B): B = {
    def helper(seq: Seq[A])(init: B)(op: (A,B) => B)(out: B): B = seq match{
      case Seq() => out
      case _ => helper(seq.tail)(init)(op)(op(seq.head,out))
    }
    helper(seq)(init)(op)(init)
  }

  println(compute(seq)(1)((n,m)=>n*m))

}
