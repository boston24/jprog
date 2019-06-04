package Lab3

object Zad4 extends App {

  def prime(n: Int): Boolean = {
    def helper(n: Int, q: Int = 2): Boolean = {

      q match{
        case n => true
        case _ => if(n%q==0) false
                  else helper(n,q+1)
      }
    }
    helper(n)
  }

  if(prime(8)==true) println("Pierwsza")
  else println("Zlozona")

}
