package Tema4_ClassesAndObjects

object DifferentType extends App {

  case class Person(name: String, isMale: Boolean, children: Person*)

  def getClassAsString(x: Any): String = x match {
    case s: String => s + " is a String"
    case i: Int => "Int"
    case f: Float => "Float"
    case l: List[_] => "List"
    case p: Person => "Person"
    case _ => "Unknown"
  }
  //Invocación
  println(getClassAsString("Hola"))
  println(getClassAsString(10))
  println(getClassAsString(2.5F))
  println(getClassAsString(List(1,2,3,4,5)))
  println(getClassAsString(new Person("Rambo", true)))

}
