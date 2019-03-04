object Main extends App {
    var x=1
    var dodatnie=0
    var ujemne=0
    while(x!=0){
        println("Podaj liczbe ( 0 konczy pobieranie liczb")
        var liczba=io.StdIn.readDouble()
        if(liczba>0){
            dodatnie=dodatnie+1
        }
        if(liczba<0){
            ujemne=ujemne+1
        }
        if(liczba==0){
            x=0
        }
    }
    println("KONIEC")
    println("Ilosc liczb dodatnich: ")
    println(dodatnie)
    println("Ilosc liczb ujemnych: ")
    println(ujemne)
}