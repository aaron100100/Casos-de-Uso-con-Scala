package BookProgrammingExamples
/*
A var is a property (or local variable) that
 can be written to multiple times. A val is a property (or local variable) that can only
 be set once.
 */
class Person(var name: String , var age: Int){
  def birthday(): Unit = {
    println("Happy Birthday, you were " + age)
    age = age + 1
    println("Today you are now " + age)
  }

  def isPensioner(): Boolean = age > 65

  def isToddler = age > 0 && age < 3

  override def toString() =
    "Person[" + name + ", " + age + "]"
}
