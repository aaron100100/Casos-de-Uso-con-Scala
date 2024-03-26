package BookProgrammingExamples

object Object1 extends App {
  val add = (a: Int, b : Int) => a + b

  println(add(39,900))
  println(add(4,5))

  // Aplicación parcial de funciones   y asignando en otra variable
  val addTwo = add(2,_:Int)
  println(addTwo(5))

  //Ejemplo 1
  val numbers = List(1,2,3,4,5,6,7)
  println(numbers)

  val filtered = numbers.filter((n:Int) => n < 3) // La función que está dentro de filter es una función anónima
  println(filtered)


}
