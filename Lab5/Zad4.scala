package Lab5

object Zad4 extends App {

  val seq = Seq[Char]('a', 'a', 'b', 'c', 'c', 'c', 'a', 'a', 'b', 'd','d')

  def compress[A](seq: Seq[A]): Seq[(A,Int)] = {
    def helper(seq: Seq[A],out: Seq[(A,Int)], counter: Int = 1): Seq[(A,Int)] = seq match {
      case _ if(seq.length==1) => out :+ (seq.head,counter)
      case _ if(seq.head==seq.tail.head) => helper(seq.tail,out,counter+1)
      case _ if(seq.head!=seq.tail.head) => helper(seq.tail,out :+ (seq.head,counter),1)
      //case (a :+ _) => out :+ (a,counter)
    }
    helper(seq,Seq())
  }

  println(compress(seq))

}
