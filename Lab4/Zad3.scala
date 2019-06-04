package Lab4

object Zad3 extends App {

  type MSet[A] = A => Int

  def +[A](a: MSet[A], b: MSet[A]): MSet[A] = (e: A) => a(e) + b(e)

  def -[A](a: MSet[A], b: MSet[A]): MSet[A] = (e: A) => if(a(e) - b(e) <= 0) 0 else a(e)-b(e)

  def &[A](a: MSet[A], b: MSet[A]): MSet[A] = (e: A) => if(a(e) > b(e)) b(e) else a(e)

}
