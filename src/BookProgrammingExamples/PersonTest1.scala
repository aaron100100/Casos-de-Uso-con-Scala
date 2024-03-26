package BookProgrammingExamples

object PersonTest1 extends App{
  val p1: Person = new Person( "Aarón", 24)
  println(p1)

  println(s"${p1.name} is ${p1.age}")
  println(s"p1.isToddle: ${p1.isToddler}")
  println(s"p1.isPensioner: ${p1.isPensioner()}")
  p1.birthday()
  p1.age = 24
}
