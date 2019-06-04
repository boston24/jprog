package Lab5

object Zad1 extends App {

  val seq = Seq[Int](2,4,6,8,10,12)

  def isOrdered[A](seq: Seq[A])(leq: (A,A) => Boolean): Boolean = {
    def helper(seq: Seq[A])(leq: (A,A) => Boolean)(check: Boolean): Boolean = {
      if(seq.length==1) return check
      check match {
        case false => false
        case true => if(leq(seq(0),seq(1))) helper(seq.tail)(leq)(true)
        else helper(seq.tail)(leq)(false)
      }
    }
    helper(seq)(leq)(true)
  }

  println(isOrdered(seq)((m,n)=>m<n))

}
