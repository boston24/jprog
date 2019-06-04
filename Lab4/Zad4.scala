package Lab4

object Zad4 extends App {

    def size[A](a: Seq[A]): Int = a.isEmpty match{
      case true => 0
      case _ => 1+size(a.tail)
    }

    def size2[A](a: Seq[A]): Int = {
      def helper(a: Seq[A], acc: Int = 0): Int = a match {
        case head+:tail => helper(tail,acc+1)
        case _ => acc
      }
      helper(a)
    }

  val seq = Seq[Int](1,2,3,4,5,6,7,8,7,5,7,8)

  println("Rekurencja zwykla: "+size(seq))
  println("Rekurencja ogonowa: "+size2(seq))

}
