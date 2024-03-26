package Tema3_ProgramacionFuncional

object Closures extends App{
  //Funciones literales, anónimas
  (x:Int) => {
    x + 1 // x es una variable vinculada
  }
  val more = 0
  (x:Int) => {
    x + more // more es una variable libre
  }

  //Funciones como valor que son funciones literales que si están almacenadas en un contenedor
  //término cerrado
  val funcion1 = (x:Int) => {
    x + 1 // x es una variable vinculada, "bound variable"
  }

  //término abierto
  //funcion2 => closure def, es una funcion como valor que hace uso de una función literal que tiene free variables
  val funcion2 = (x:Int) => {
    x + more // more es una variable libre
  }

  // Aquí va otro ejemplo de closure
  var more1 = 1

  var closure = (x:Int) => x + more1

  println(closure(10))

  more1 = 90

  println(closure(10))



}
