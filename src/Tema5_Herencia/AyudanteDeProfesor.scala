package Tema5_Herencia

class AyudanteDeProfesor(nombre: String, edad: Int, materiaJefe: String, val jefe: Profesor) extends Profesor(nombre, edad , materiaJefe) {
  override val materia: String = "Español"// se modifica atributo heredado por Profesor
  def ayudar: Unit = println(s"Estoy ayudando en la materia de: $materia al profesor: ${jefe.nombre}")
/*
  override def enseñar(): Unit = {
    super.enseñar// lama primero al metodo de la clase padre
    println("Solo enseño medio tiempo") //esta ya es funcionalidad de la clase hija
    Video de final members
  }*/

  override def presentarse(): Unit =
    super.presentarse()
}

object Test1 extends App{
  val profesor1: Profesor = new Profesor("Luis", 45, "Matemáticas")
  val ayudante1: AyudanteDeProfesor = new AyudanteDeProfesor("Aarón", 24, "Matemáticas", profesor1)
  //val persona1: Persona = new AyudanteDeProfesor("Karla",25, "Biología", profesor1)
  //val ayudante2: AyudanteDeProfesor = new AyudanteDeProfesor("Maria",30, "Historia",ayudante1)

  //ayudante2.ayudar
  println("====================")

  //persona1.presentarse
  //persona1.ayudar
  println("====================")
  profesor1.presentarse
  profesor1.enseñar
  //profesor1.calificar
  profesor1.evaluacion
  println("====================")
  ayudante1.presentarse
  ayudante1.enseñar
  //ayudante1.calificar
  ayudante1.evaluacion
  ayudante1.ayudar
  println("====================")
  /*
  irAlCine(persona1)
  irAlCine(profesor1)
  irAlCine(ayudante1)
  */
  def irAlCine(persona: Persona): Unit = {// este objeto puede elegir a cualquiera de sus subclases es decir profesor o ayudante de profesor
    println(persona.nombre + "está en el cine")
  }
}
/*
Notas importantes del video de herencia:
no se pueden heredar métdos privados!!!!!
en el caso del video se antepone en el método calificar(De la clase Profesor) la palabra reservada private entonces la clase ayudante ya no hereda ese metodo
el otro punto importante: ya no es utilizable en un contexto externo a la firma del método o la clase
Para hacer uso de las metodos privados se puede optar por hacer la llamada de dicho método desde otro método
val => hace referencia un atributo de la clase de lo contrario solo es un parametro de la clase
se puede hacer override sobre la clase padre y la clase padre de su clase padre

Polimorfismo
Podemos instanciar objetos del tipo de clase Padre usando constructores de las clases hijas
polimorfismo es esa capacidad de las clases de comportarse como otras aplica solo cuando queremos tener una clase que se comporte como sí misma
o como una de sus clases hijas
override permite sobreescribir un metodo de una clase padre
con la palabra final antes de un metodo lo usamos para bloquear dicho metodo de esta forma no puede ser sobrescrito pero si heredado
se puede aplicar a atributos y metodos
lo importante es que nos apoya que tanto metodo o atributo no se puedan sobrescribir
 */
