package Tema4_ClassesAndObjects

object PersonExample extends App{
  val person: Person = new Person
  //person.age = 31
  //print(person.age)
  println(person.getAge())

  //como es private el campo ahe debemos usar los metodos get y set  (encampsulamiento)
  person.setAge(24)
  println(person.getAge())

  println(person.getName())
  person.setName("Aarón Meza")
  println(person.getName())
}

class Person{
  //campo o variable edad
  private var age: Int = 0
  // campo o variable nombre
  private var name: String = "cadena vacia"

  //método get, sirve para regresar un campo previamente asignado o no asignado. Campo edad
  def getAge(): Int = {
    return age
  }
  //método set, sirve para asiganación del campo edad
  def setAge(age: Int): Unit ={
    this.age = age
  }
  //método que regresa el valor del campo nombre
  def getName(): String = {
    return name
  }
  //método que asigna valor al campo name
  def setName(name: String): Unit = {
    this.name = name
  }
}

