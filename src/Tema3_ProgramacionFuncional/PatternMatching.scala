package Tema3_ProgramacionFuncional

object PatternMatching extends App {
  val aNumber: Any = 4d

  def pmTest(x: Any): Any = {
    x match {
      case 1 => "uno"
      case 2 => "dos"
      case i: Integer => s"Es un entero: $i"
      case _ =>
    }

  }
  //println(pmTest(aNumber))

  //Listas
/*
  List(4,2,454,23) match {
    case List(0, _*) => println("Empieza con 0")
    case List(_, 2,_*) => println("Hay un 2 en la segunda posición")
  }
*/

  //Pattern guards
  case class Persona(nombre: String, edad: Int)
  val mexicana: Persona = Persona("Norma", 58)

  mexicana match {
    case Persona(_, e) if e < 18 => //println(s"${mexicana.nombre} no puede tomar alcohol")
    case _ => //println(s"${mexicana.nombre} puede tomar alcohol")
  }

  case class Op(left:Int,right: Int,op: String)

  def cambio(op: Op): Any = op match {
    case Op(x,y, "*") if x == y => Op(x,x,"+")
    case a @ Op(x, y , z ) => a
  }

  println(cambio(Op(1,1,"*")))




}
