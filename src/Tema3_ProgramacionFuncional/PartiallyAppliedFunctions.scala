package Tema3_ProgramacionFuncional

object PartiallyAppliedFunctions extends App {
  def obtenerPrecioCafe(tamaño: String, cantidad: Int): Float = {
    tamaño match {
      case "chico" => 25 * cantidad
      case "mediano" => 35 * cantidad
      case "grande" => 45 * cantidad
    }
  }

  val obtenerPrecioCafeChico = obtenerPrecioCafe("chico", _:Int)
  val obtenerPrecioCafeMediano = obtenerPrecioCafe("mediano", _:Int)
  val obtenerPrecioCafeGrande = obtenerPrecioCafe("grande", _:Int)


  println(obtenerPrecioCafeChico(3))
  println(obtenerPrecioCafeMediano(13))
  println(obtenerPrecioCafeGrande(6))
}
