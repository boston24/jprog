package zad1

object zad6 extends App {

  println("Podaj ilosc wyrazow: ")
  var n=io.StdIn.readInt()
  var tab = new Array[String](n)
  var i=0

  while(i<n){
    println("Podaj wyraz: ")
    tab(i)=io.StdIn.readLine()
    i=i+1
  }

  i=0
  println("Slowa nieposortowane dlugoscią: ")
  while(i<n){
    println(tab(i))
    i=i+1
  }

  i=0
  var j=0
  var help=""

  while(j+1<n){
    while(i+1<n){
      if(tab(i).length>tab(i+1).length){
        help=tab(i)
        tab(i)=tab(i+1)
        tab(i+1)=help
      }
      if(tab(i).length==tab(i+1).length){
        var x=0
        while(x+1<tab(i).length){
          if(tab(x)>tab(x+1)){
            help=tab(i)
            tab(i)=tab(i+1)
            tab(i+1)=help
          }
          x=x+1
        }
      }
      i=i+1
    }
    j=j+1
    i=0
  }

  i=0
  println("Slowa posortowane dlugoscią: ")
  while(i<n){
    println(tab(i))
    i=i+1
  }

}
