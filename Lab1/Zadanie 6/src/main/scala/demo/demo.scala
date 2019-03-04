package demo

object demo extends App{
    var liczba=1
    while(liczba<2 || liczba%2!=0){
        println("Podaj liczbę parzystą większą od 2")
        liczba=io.StdIn.readInt()
    }

    println("Podana liczba: ")
    println(liczba)

    var i=2

    while(i<liczba/2){

        var dzielnik=2                      // i + x = liczba
        var czyZlozona=0

        while(dzielnik<i){
            if(i%dzielnik==0){
                czyZlozona=1            //sprawdzenie czy i to l.pierwsza
            }
            dzielnik=dzielnik+1
        }


            var x=liczba-i

            var dzielnik2=2
            var czyZlozona2=0

            while(dzielnik2<x){                                        //sprawdzenie czy x to l.pierwsza
                if(x%dzielnik2==0){
                    czyZlozona2=1
                }
                dzielnik2=dzielnik2+1
            }

            if(czyZlozona==0 && czyZlozona2==0){
                print(i)
                print(" + ")
                print(x)
                print(" = ")
                print(liczba)
                i=liczba/2
            }

            i=i+1

            if(i==liczba/2){
                print("error")
        }



    }

}
