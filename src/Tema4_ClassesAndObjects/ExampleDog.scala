package Tema4_ClassesAndObjects

trait Animal

case class Dog(name: String) extends Animal
case class Cat(name: String) extends Animal
case object Hamster extends Animal

object CaseMatch extends App{

  def determinateType(x: Animal): String = x match {
    case Dog(firulais) => "Got a Dog, name = " + firulais
    case _: Cat => "Got a Cat (ignoring the name)"
    case Hamster => "That was a Hamster"
    case _ => "That was something else"
  }

  println(determinateType(new Dog("Firulais")))
  println(determinateType(new Cat("Katty")))
  println(determinateType(Hamster))
}

