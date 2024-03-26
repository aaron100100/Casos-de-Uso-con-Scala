package Tema4_ClassesAndObjects
object ExamplePerson extends App{
  case class Person(name: String, isMale: Boolean, children: Person*)


  val lucy = Person("Lucy", false)
  val maria = Person("Maria", false)
  val charles = Person("Charles", true)
  val geoffrey = Person("Geoffrey", true)
  val jane = Person("Jane", false, lucy, maria)
  val people = List(lucy,charles,jane,geoffrey)


  val onlyFemaleFilter = people filter (p => !p.isMale) flatMap (p => p.children map ( c => (p.name, c.name)))
  onlyFemaleFilter.foreach(print)

  println()
  //Pasar la sentencia de la linea 16 a un for comprehesion
  val Result = for{
    p <- people;
    if !p.isMale;
    c <- p.children
  } yield (p.name,c.name)
  Result.foreach(print)

  println()

  val Result2 = for{
    p <- people
    nombre = p.name
    if (nombre startsWith("Ge"))
 } yield nombre

  Result2.foreach(print)






}
