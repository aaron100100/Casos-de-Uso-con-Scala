package Tema2

object TabulateFuncion extends App {
  val squares = List.tabulate(6)( n => n * n)
  println("squares:" + squares)


  val mul = List.tabulate(4,5)(_ * _)

  println("mul : " + mul)


}
