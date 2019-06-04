package Lab4

object Zad5 extends App {

  val seq = Seq[Int](2,4,6,8)


  def checkAll[A](a: Seq[A])(pred: (A) => Boolean): Boolean = {
    def helper(a: Seq[A])( pred: (A) => Boolean)( check: Boolean = true): Boolean = {
      if(!check) return false
      a match {
        case Seq() => true
        case head+:tail => helper(tail)(pred)(pred(head))
      }
    }
    helper(a)(pred)()
  }

  println(checkAll(seq)( (n) => n %2 != 0 ))

}
