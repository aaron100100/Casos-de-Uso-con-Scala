package Tema4_ClassesAndObjects

object ExampleTc extends App{
  val s = "r"
  try {
    val i = s.toInt
  }catch {
    case e: Exception => e.printStackTrace()
  }finally {
    println("Adios Mundo")
  }
}
