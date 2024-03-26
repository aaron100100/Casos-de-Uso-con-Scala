package Tema5_Herencia

class Profesor(nombre: String, edad: Int,  val materia: String) extends Persona(nombre,edad) {
  final def enseñar: Unit = println(s"Estoy enseñando $materia")
  def evaluacion: Unit = if (edad > 35 ) calificar else println("No puedes calificar")
  private def calificar: Unit = println("Estoy calificando")
}
/*
object TestProfesor extends App{
  val profesorPrueba = new Profesor("Aarón", 45, "matemáticas")
  profesorPrueba.materia
}//la linea 10 nos va a lanzar un error si no ponemos  val en el atributo de la clase Profesor
 */

