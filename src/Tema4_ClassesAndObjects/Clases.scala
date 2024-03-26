package Tema4_ClassesAndObjects

object Clases extends App{
  val mySubtract = new Subtract()
  mySubtract.increment()
  println(mySubtract.current())

  mySubtract.decrement()
  println(mySubtract.current())


}
//  Aqui comienza la clase
class Subtract(){
  private var value = 10 //campos o variables de la clase
  def decrement(): Unit = { //linea 16 a 19 método de decremento de la clase
    value = value - 1
    //value; si ponemos Int en lugar de Unit
  }
  //para la primer pregunta, si sustituimos Int por Unit nos frozamos a que nuestra función decrement regrese un tipo de dato Int
  //En la linea 18 lo estamos regresando y no es necesario hacer uso de return como  en java
  //Pregunta 2: No pasa nada si quitamos el tipado de la variable, scala infiere el tipo de dato
  def current() =  value //metodo de la clase regresa el valo actual del campo value
//linea 25 a 27, metodo que quita 5 unidades a la variable value
  def increment(): Unit = {
    value = value  + 5
  }
  // Aquí termina la clase
}
