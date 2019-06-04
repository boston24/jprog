package Lab4

object Zad2 extends App {

  type Pred[A] = A => Boolean

  def and[A](p: Pred[A], q: Pred[A]): Pred[A] = { a: A => p(a) && q(a) }

  def or[A](p: Pred[A], q: Pred[A]): Pred[A] = { a: A => p(a) || q(a) }

  def not[A](p: Pred[A]): Pred[A] = { a: A => !p(a) }

  def imp[A](p: Pred[A], q: Pred[A]): Pred[A] = { a: A => !(p(a) && !q(a)) }

}
