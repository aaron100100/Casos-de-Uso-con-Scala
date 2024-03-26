package Tema4_ClassesAndObjects

object ForGenerator extends App {
  case class Books(name: String)

  val book = List(Books("Atlas de México"),
    Books("To learn scala"))

  val a = for {
    b <- book //generator
    n = b.name // definition
    if ( n startsWith("To")) //filter
  } yield n

  println(a)
  val numberText = for(x <- List(1,2); y <- List("One", "Two")) yield (x, y) //permutaciones de ambas listas
  numberText.foreach(print)

}
