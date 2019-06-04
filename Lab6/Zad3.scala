package Lab6

object Zad3 extends App {

  val seq = Seq[Int](1,3,5,6,7)

  def divide[A](seq: Seq[A]): (Seq[A],Seq[A]) = {
    def helper(seq: Seq[A],out: (Seq[A],Seq[A]), counter: Int = 1): (Seq[A],Seq[A]) = seq match {
      case Seq() => out
      case _ if(counter%2==0) => helper(seq.tail, (out._1,out._2 :+ seq.head),counter+1)
      case _ if(counter%2==1) => helper(seq.tail, (out._1 :+ seq.head, out._2),counter+1)
    }
    helper(seq,(Seq(),Seq()))
  }

  println(divide(seq))

}
