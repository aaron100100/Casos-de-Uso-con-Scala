package Tema4_ClassesAndObjects
//sobrecarga de metodos
class Rational(n: Int, d: Int){
  private val g = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n:Int) = this(n, 1)
//suma
  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def +(i: Int): Rational =
    new Rational(numer + i * denom, denom)

  //resta
  def -(that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def -(i: Int): Rational =
    new Rational(numer - i * denom, denom)

  //multiplicación
  def *(that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def *(i: Int): Rational =
    new Rational(numer * i, denom)

//división
  def /(that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def /(i: Int): Rational =
    new Rational(numer, denom * i)


  private def gcd(a: Int, b: Int): Int =
    if( b == 0 ) a
    else gcd(b, a % b)

  def lessThan(that: Rational): Boolean =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational): Rational =
    if( this.lessThan(that)) that else this

  override def toString: String = numer + " / " + denom

}
object implicitConvertion{
  implicit def intToRational(x: Int): Rational = new
  Rational(x)
}
