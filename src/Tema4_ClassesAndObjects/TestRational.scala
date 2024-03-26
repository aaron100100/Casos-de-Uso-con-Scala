package Tema4_ClassesAndObjects

object TestRational {
  def main(args: Array[String]): Unit = {
    val rationalX = new Rational(2,3)
    val rationalY = new Rational(2,5)

    val rationalZ = rationalX/rationalY
    val rationalW = rationalX/5

    val rationalA = new Rational(1,1)
    val rationalB = rationalA + 2

    println(rationalZ)
    println(rationalW)
    println(rationalB)
  }
}
