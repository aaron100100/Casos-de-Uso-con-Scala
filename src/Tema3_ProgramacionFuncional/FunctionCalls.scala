package Tema3_ProgramacionFuncional

object FunctionCalls extends App {
  def greet(prefix: String = "Hola", name: String ):String  = s"$prefix $name"


  println(greet("Hi","Juan"))


  //greet("Hola", "Vicente")
  //greet(name = "Normita", prefix = "Buen día")

  //Lamando funciones con argumentos por defecto

  //parametros repetidos
  def suma(params: Int*): Int = {
    var total = 0
    for ( i <- params) total += i
    total
  }
  println(suma(15,98,788))
  println(suma(12,10,10,233,345,435,345,345))
  println(suma())





}
