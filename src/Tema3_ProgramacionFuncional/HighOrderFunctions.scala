package Tema3_ProgramacionFuncional

object HighOrderFunctions extends App{
  def format(number: Double) = f"$number%.2f"

  println(format(3.453535)) // Forma común de llamar a una función. Valor entre parentesis
  println(format{val constante = 10; 123.234242 * constante}) // Bloque de expresión envuelto entre llaves

  def safeStringOp(s: String) (f: String => String) = {
    if (s != null) f(s) else s
  }

  val id = java.util.UUID.randomUUID().toString
  val timeId = safeStringOp(id) {s =>
    val now = System.currentTimeMillis()
    val timed = s.take(24) + now
    timed.toUpperCase()
  }
  println(id)
  println(timeId)
}
