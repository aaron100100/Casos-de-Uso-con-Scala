package Tema3_ProgramacionFuncional

object Recursion extends App {
  @annotation.tailrec
  def exponencial(num: BigInt, exp: BigInt, aux: BigInt = 1): BigInt = {
    if (exp < 1) aux
    else exponencial(num, exp - 1, num * aux)

  }

  println(exponencial(2,10000))

}
