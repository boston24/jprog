package Lab3

object Zad3 extends App {

  def count(str: String): Int = {
    def helper(str: String, count: Int): Int = {
      str.length match {
        case 0 => count
        case _ => if (str.charAt(0) > 96 && str.charAt(0) < 123) helper(str.substring(1), count + 1)
        else helper(str.substring(1), count)
      }
    }

    helper(str, 0)
  }

  println(count("Ala Ma Kota"))

}
