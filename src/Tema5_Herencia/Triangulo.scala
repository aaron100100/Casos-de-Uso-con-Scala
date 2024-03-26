package Tema5_Herencia

class Triangulo(base: Int, altura: Int) extends FiguraGeometrica {
  override val numeroLados: Int = 3
  override def perimetro(): Int =  base * numeroLados

  override def area(): Double  = (base * altura) / 2



}

object Test extends App{
  //val figuraGeometrica = new FiguraGeometrica()// no se pueden instanciar figuras geometricas por que es abstracta
  val triangulo = new Triangulo(3 , 4)
  println(triangulo.perimetro())
  println(triangulo.area())
}

/*
cuestinario. Para que funciona una clase abstracta
cómo la podrían implementar y en que casos nos sería de uso

 */