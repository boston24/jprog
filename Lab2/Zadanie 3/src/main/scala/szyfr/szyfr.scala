package szyfr

object szyfr extends App{

  println("Podaj slowo/zdanie do zaszyfrowania ")
  val s = io.StdIn.readLine()
  val slowo = s.replace(" ","")
  println("Podaj klucz ")
  val k = io.StdIn.readLine()
  val klucz = k.replace(" ","")



  val dS = slowo.length
  val dK = klucz.length
  println("Dlugosc: " + dS)

  println(slowo)

  var x = 0

  var kod = new Array[Char](dS)

  while(x<dS){
    var y = x%dK
    kod(x)=klucz(y)
    print(klucz(y))
    x+=1
  }


  val tab = Array.ofDim[Char](26, 26)
  val alf = ('A' to 'Z').toArray

  var p = 0
  var q = 0

  println("")

  while(p<26){
    q = 0
    while(q<26){
      var litera = (p+q)%26
      tab(p)(q) = alf(litera)
      //print(tab(p)(q))
      // print(" ")
      q+=1
    }
  p+=1
  }

  //val tab = ('A' to 'Z').toArray

  println("")

  p = 0
  q = 0

  println("Tablica szyfrująca: ")

  while(p<26){
     println("")
     q = 0
    while(q<26){
      print(tab(p)(q))
      print(" ")
      q+=1
    }
    p+=1
  }

  x = 0
  var y = 0

  println("")
  println("Po zaszyfrowaniu: ")

  while(x<dS){
    var a = slowo(x).toInt
    if(a>90){
      a=a-97
    }
    else{
      a=a-48
    }

    var b = kod(x).toInt
    if(b>90){
      b=b-97
    }
    else{
      b=b-48
    }

    print(tab(a)(b))

    x+=1


  }






}
