package Lab3

object Zad2 extends App {

  //var tab = new Array[Int](7)
  var tab = Array(1,2,2,3,3,2,2,1)

  def palindrome(tab: Array[Int]): Boolean = {
    def helper(tab: Array[Int], out: Boolean = false, help: Int = 0 ): Boolean = help match{
      case _ if(help==tab.length/2) => out
      case _ if(tab(help)==tab(tab.length-help-1)) => helper(tab,true,help+1)
      case _ if(tab(help)!=tab(tab.length-help-1)) => false
    }
    helper(tab)
  }

  println(palindrome(tab))

}