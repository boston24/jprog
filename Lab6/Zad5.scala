package Lab6

object Zad5 extends App {

  val seq = Seq[Int](1,2,3,4)

  def compute[A,B](seq: Seq[A])(init: B)(op: (A,B) => B): B = {
    def helper(seq: Seq[A])(init: B)(op: (A,B) => B)(out: B): B = seq match{
      case Seq() => out
      case _ => helper(seq.tail)(init)(op)(op(seq.head,out))
    }
    helper(seq)(init)(op)(init)
  }

  def size[A](a: Seq[A]): Int = compute(a)(0)((_,n: Int)=> n+1)

  def reverse[A](a: Seq[A]): Seq[A] = compute(a)(Seq(): Seq[A])((e: A, out: Seq[A]) => e +: out)

  def applyforall[A, B](a: Seq[A], f: A => B): Seq[B] = compute(a)(Seq(): Seq[B])((a: A, out: Seq[B]) => f(a) +: out).reverse

  def filter[A](a: Seq[A], pred: A=>Boolean): Seq[A] = compute(a)(Seq(): Seq[A])((a: A, out: Seq[A]) =>
    if(pred(a)) a +: out else out).reverse

  def forall[A](a: Seq[A], pred: A=>Boolean): Boolean = compute(a)(true)((a: A, out: Boolean) =>
    if (pred(a)) out else false)

  println("Wybierz funkcje ")
  var choice = io.StdIn.readInt()

  while(choice!=0){

    choice match {
      case 1 => println(size(seq))
      case 2 => println(reverse(seq))
      case 3 => println(applyforall[Int,Int](seq,(n)=>n+2))
      case 4 => println(filter[Int](seq,(n)=>n%2==0))
      case 5 => println(forall[Int](seq,(n)=>n%2==0))
    }

    println("Wybierz funkcje ")
    choice = io.StdIn.readInt()


  }

}
