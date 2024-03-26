package Tema4_ClassesAndObjects

/*
Awui hacemos lo mismo que en el código Testclasscricle pero con la variante que el objeto herede de la clase APP
para que ya no sea necesario crear un metodo main como punto de entreda de nuestra aplicación
 */
object TestClassAnotherCircle extends App {
  val circle1 = new Circle((args mkString ", ").toDouble)
  println(circle1.area)

}
