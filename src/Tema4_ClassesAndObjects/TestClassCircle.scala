package Tema4_ClassesAndObjects
import scala.math._

class Circle(radius: Double){
  import Circle._
  def area: Double = calculateArea(radius)
}

object Circle{
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
}

object TestClassCircle {
  def main(args: Array[String]): Unit = {
    val circle1 = new Circle(args(0).toDouble)
    println(circle1.area)


  }

}
/*
 En este código creamos una clase Circle con un metodo calcular área y creamos un objeto Tesclasscircle para poder probar dicha clase
 notemos que el metodo constructor de esta clase recibe como parametros un atributo llamado radio que en nuestro caso lo estamos
pasando como párametro en un arreglo de strings y luego hacemos la conversion a double
todo esto desde un metodo main */