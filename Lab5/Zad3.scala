package Lab5

object Zad3 extends App {

  val seq = Seq[Int](1, 1, 2, 4, 4, 4, 1, 3)

  def deStutter[A](seq: Seq[A]): Seq[A] = {
    def helper(seq: Seq[A], out: Seq[A]): Seq[A] = seq match {
      case _ if(seq.length==1) => out :+ seq.head
      case _ if(seq.head==seq.tail.head) => helper(seq.tail,out)
      case _ => helper(seq.tail,out :+ seq.head)
    }
    helper(seq,Seq())
  }

  println(deStutter(seq))

}

