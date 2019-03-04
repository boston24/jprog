object Main extends App {
    println("Podaj liczbe")
    var liczba=io.StdIn.readInt()
    var dzielnik=2
    var czyZlozona=0
    while(dzielnik<liczba){
        if(liczba%dzielnik==0){
            czyZlozona=1
        }
        dzielnik=dzielnik+1
    }
    if(czyZlozona==0){
            println("Podana liczba jest pierwsza")
        }
        else{
            println("Podana liczba nie jest pierwsza")
        }
    
}
