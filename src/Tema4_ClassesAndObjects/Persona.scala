package Tema4_ClassesAndObjects

object Persona extends App{

  object person{
    val ojos = 2
    def boxear: Boolean = true
  }
  class person{
//funcionalidad a nivel instancia
  }
  val rocky = person
  val rambo = person

  println(rocky == rambo)

}
