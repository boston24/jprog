package nwd

object nwd extends App{

  print("Podaj liczbe A: ")
  var a=io.StdIn.readInt()
  print("Podaj liczbe B: ")
  var b=io.StdIn.readInt()

  while(a!=b){
    if(a>b){
      a=a-b
    }
    else{
      b=b-a
    }
  }

  println("NWD: ")
  print(a)

}
