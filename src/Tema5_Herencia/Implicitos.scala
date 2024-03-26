package Tema5_Herencia

object Implicitos extends App{
  val cadena = "Jorge" -> "123"
  //println(cadena)

  class Persona(nombre: String){
    def saludar: Unit = println(s"Hola, mi nombre es $nombre")
  }

 implicit def stringToPersona(nombre: String) = new Persona(nombre)
  //"Jorge".saludar
 // "2/3", "5/9"
  class Fraccion(numero: String){
   val numerador: Int = numero.split("/")(0).toInt
   val denominador: Int = numero.split("/")(1).toInt

   def getString = s"$numerador/$denominador"
    //método de multiplicación
   def x(other: Fraccion) = {
     new Fraccion(s"${numerador * other.numerador}/${denominador * other.denominador}")
   }
    def /(other: Fraccion): Fraccion = {
      new Fraccion(s"${numerador * other.denominador}/${denominador * other.numerador}")
    }

    def y(other: Fraccion): Fraccion = {
      new Fraccion(s"${numerador * other.denominador + denominador * other.numerador}/${denominador * other.denominador}")
    }

    def -(other: Fraccion): Fraccion = {
      new Fraccion(s"${numerador * other.denominador - denominador * other.numerador}/${denominador * other.denominador}")
    }
 }
  implicit def stringToFraccion(numero: String) = new Fraccion(numero)

  println(("2/3" x "5/9").getString)
  println(("11/4" / "1/2").getString)
  println(("1/2" y "1/2").getString)
  println(("3/4" - "5/2").getString)

  def incrementar(numero: Int)(implicit incremento: Int) = numero + incremento
  implicit val incrementoPorDefault = 10
  //implicit val incrementoPorDefault2 = 10
  //println(incrementar(2))


}
