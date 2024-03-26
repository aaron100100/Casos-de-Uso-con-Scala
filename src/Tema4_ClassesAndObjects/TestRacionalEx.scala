package Tema4_ClassesAndObjects

object TestRacionalEx extends App {
  val rational: RationalEx = new RationalEx(1,8)
  println(rational.lessThan(new RationalEx(1,4)))

  val rationalexampleX = new RationalEx(1,2)
  println(rationalexampleX) // aqui ya va a funcionar la sobrescritura del metodo to string
  val num1: RationalEx = new RationalEx(4,5)
  val num2: RationalEx = new RationalEx(3,9)

}
//clase de numeros racionales
//n numerador de un afracción , d denominador de una fracción
class RationalEx(n:Int, d:Int){
  //se requiere que d no sea cero, de lo contrario se lanza un aexcepción
  require(d != 0)
  //aqui obtenemos el maximo comun divisor del numerador y denominador
  private val g = gcd(n.abs, d.abs)
  // estas dos variables nos sirven por que nos ayudan a obtener de forma reducida o simplificada la fracción
  //notar que dividimos entre el mcd
  val numer: Int = n / g
  val denom: Int = d / g
  //función para calcular el mcd de forma recursiva
  private def gcd(a: Int, b: Int): Int =
    if ( b == 0 ) a else gcd(b, a  %  b)
  //función que regresa verdadero o falso
  //true si el objeto de tipo RationaEx que invoca a la función lessThan es menor al objeto that de tipo RelationalEx
  //false de lo contario
  def lessThan(that: RationalEx): Boolean =
    this.numer * that.denom < that.numer * this.denom
// si el objeto que invoca esta función es menor al objeto que entra como argumento => regresa el objeto que entró como argumento
//si el objeto que invoca a esta función es mayor que el objeto que entra como argumento entonces se regresa el objeto que invoca
  def max(that: RationalEx): RationalEx =
    if ( this.lessThan(that)) that else this
  //para el métod println sobre escritura del método
  override def toString: String = numer + " / " + denom

  //Método para multiplicar racionales
  //sobreesecribiendo el metodo del producto de numeros normalito
  /*
  def *(that: RationalEx): RationalEx =
    new RationalEx(numer * that.numer, denom * that.denom)*/


}
