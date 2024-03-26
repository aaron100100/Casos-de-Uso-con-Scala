package Tema4_ClassesAndObjects

object Pizzeria extends App {
  println("Salida 1")
  val pizza1 = new Pizza()

  println("Salida 2")
  val pizza2 = new Pizza(5)

  println("Salida 3")
  val pizza3 = new Pizza(8, true)

  println("Salida 4")
  val pizza4 = new Pizza(2, false, "redonda")

}
//constructor primario y def de la clase
class Pizza(size_pizza: Int, flag_cheese: Boolean, form_pizza: String, type_mass: String) {
  //println("Ontoy")

  def this(size_piza: Int, flag_cheese: Boolean) {
    this(size_piza, flag_cheese, "redonda", "delgada")
    println("Primera Invocación al constructor principal")
  }

  def this(size_pizza: Int){
    this(size_pizza, true, "triangular", "gruesa")
    println("segunda invocación al constructor principal")
  }

  def this(){
    this(5, false)
    println("invocación constructor auxiliar con 2 argumentos")
  }

  def this(size_pizza: Int, flag_cheese: Boolean, form_pizza: String){
    this(size_pizza)
    println("invocación constrcutor auxiliar con 1 argumento")
  }
}
