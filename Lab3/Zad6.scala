package Lab3

object Zad6 extends App {

  def printTriangle(n: Int): Unit = {
    def printTriangleAux(n: Int, values: Array[Int] = Array(1)): Unit = {
      if(values.length <= n) {
        printRow(values)
        println()
        printTriangleAux(n, recalculate(values) :+ 1)
      }
    }
    printTriangleAux(n)
  }

  def printRow(values: Array[Int]): Unit = {
    if(values.length != 0) {
      print(values.head)
      if(values.length != 1) print("   ")
      printRow(values.tail)
    }
  }

  def recalculate(values: Array[Int]): Array[Int] = {
    val temp = new Array[Int](values.length)
    temp(0) = 1
    var i = 1
    while(i < temp.length) {
      temp(i) = values(i) + values(i-1)
      i += 1
    }
    temp
  }

  println(printTriangle(8))

}
