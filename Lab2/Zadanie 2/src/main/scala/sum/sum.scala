package sum

object sum extends App {

  println("Podaj liczbe A: ")
  var a = io.StdIn.readLine()
  println("Podaj liczbe B: ")
  var b = io.StdIn.readLine()

  val aD = a.length
  val bD = b.length

  /*
  println(aD)
  println(bD)
  */

  if(aD>bD){

    var wynik = new Array[Int](a.length+1)
    var i = a.length-1
    var j = b.length-1
    var help = 0

    while(j>=0){

      var x = a(i).toInt-48
      var y = b(j).toInt-48

      /*
      println(" Dodaje liczby: ")
      print(x)
      print(" i ")
      print(y)
      */

      if(help+x+y>9){
        wynik(i) = help+(x+y)-10
        help=1
      }
      else{
        wynik(i) = help+x+y
        help=0
      }
      j-=1
      i-=1

    }

    var z = 0

    while(z<aD-bD){
      var q = a(z).toInt-48
      if(z==aD-bD-1){
        wynik(z) = q+help
      }
      else{
        wynik(z) = q
      }
     z+=1
    }
    println(" Wynik dodawania liczby ")
    print(a)
    print(" i ")
    print(b)
    print(" = ")
    var p = 0
    while(p<a.length){
      //print(" ")
      print(wynik(p))
      p+=1
    }
  }
    //////////////////////////////////////////////////////////////////////////////////////
  else{

    var wynik = new Array[Int](b.length+1)
    var i = a.length-1
    var j = b.length-1
    var help = 0

    while(i>=0){

      var x = a(i).toInt-48
      var y = b(j).toInt-48

      /*
      println(" Dodaje liczby: ")
      print(x)
      print(" i ")
      print(y)
      print(" = ")
      print(x+y)
      */

      if(help+x+y>9){
        wynik(j) = help+(x+y)-10
        help=1
      }
      else{
        wynik(j) = help+x+y
        help=0
      }
      j-=1
      i-=1

    }

    var z = 0

    while(z<bD-aD){
      var q = b(z).toInt-48
      if(z==bD-aD-1){
        wynik(z) = q+help
      }
      else{
        wynik(z) = q
      }
      z+=1
    }
    println("Wynik dodawania liczby ")
    print(a)
    print(" i ")
    print(b)
    print(" = ")
    var p = 0
    while(p<b.length){
      //print(" ")
      print(wynik(p))
      p+=1
    }
  }
}
