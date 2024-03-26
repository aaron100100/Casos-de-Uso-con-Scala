package Tema3_ProgramacionFuncional

object FirstClassFunctions extends App {
  //funciones anónimas
  //List(1,2,3).map((x:Int) => x * x).foreach(println) //la entrada dentro del map es nuestra función anónima

  //funciones como valor
  val funcionCuadratica = (x:Int) => x * x
  //List(2,5,6).map(funcionCuadratica(_)).foreach(println)
  //List(2,3,7,10,22).map(funcionCuadratica(_)).foreach(println)


  //funciones que reciben otras funciones
  //List(1,2,3).filter((x: Int) => x > 1).foreach(println)

  //funciones que retornan otras funciones
  def saludar(prefix: String) = {
    (name: String) => println(s"$prefix $name")
  }
  //println(saludar("Hola"))
  saludar("Hi")("Norma")

  val hello = saludar("Hello")
  hello("Teresa")

  val hi = saludar("Hi")
  hi("Alejandro Meza")








}
