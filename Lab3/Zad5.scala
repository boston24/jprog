package Lab3

object Zad5 extends App {

  def reku(n: Int ): Int = {          //zwykla rekurencja
    n-1 match{
      case 0 => 1
      case 1 => 1
      case _ => reku(n-1)+reku(n-2)
    }
  }


  def fibo(n: Int): Int = {            //rekurencja ogonowa
    def helper(n: Int, prev: Int = 1,curr: Int = 0 ): Int = {
      n match {
        case 0 => curr
        //case 1 => 1
        case _ => helper(n-1,prev+curr,prev)
      }
    }
    helper(n)
  }
  println(fibo(10))
  println(reku(10))

}
