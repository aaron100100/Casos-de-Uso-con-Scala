package Tema2

object MapFuncion extends App {
  val listNums: List[Double] = List(1,2,6,5,5,6,4)

  def sumList(list: List[Double]): Double = {
    if (list.isEmpty) 0.toDouble
    else list.head + sumList(list.tail) // 1 + sumList([2,6,5,5,6,4])
  }
  val mean = sumList(listNums)/listNums.length

  println(mean)

  val variance = sumList(listNums.map(x => (x - mean) * ( x - mean)))

}
