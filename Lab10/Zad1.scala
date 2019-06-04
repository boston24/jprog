package Lab10

object Zad1 extends App {

 /* val secret = Seq(1, 3, 2, 2, 4, 5)
  val guess = Seq(2, 1, 2, 4, 7, 2)

  def b(secret: Seq[Int], guess: Seq[Int], OutB: Int = 0, OutW: Int = 0): Int = guess match {
    case Seq() => OutB
    case _ => if (secret.zipWithIndex.head._1 == guess.zipWithIndex.head._1 && secret.zipWithIndex.head._2 == guess.zipWithIndex.head._2) {
      b(secret.tail, guess.tail, OutB + 1, OutW)
    }
    else if (secret.zipWithIndex.head._1 != guess.zipWithIndex.head._1) {
      b(secret.tail, guess.tail, OutW + white(secret, guess.head))
    }
  }
  def white(secret: Seq[Int], check: Int, white: Int = 0): Int = secret match {
    case Seq() => white
    case _ => if(secret.head == check) white(secret.tail, check, white + 1)
    else white(secret.tail,check,white)
  }

  println("Black: " + b(secret,guess))
*/
}
