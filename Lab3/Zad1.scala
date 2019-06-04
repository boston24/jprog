package Lab3

object Zad1 extends App {

  println("Input:  ")
  val word = io.StdIn.readLine()

  def reverse(str: String): String = {
    def helper(str: String , out: String = "" ): String = str.length match {
      case 0 => out
      case _ => helper(str.tail,str.head +: out)
  }
    helper(word)
  }

  println("Output: " + reverse(word))



}
