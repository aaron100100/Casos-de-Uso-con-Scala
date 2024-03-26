package BookProgrammingExamples

object Object3 extends App {
  var increase = (x : Int) => x + 1
  var y = 1
  println("Valor Inicial de y: " + y)

  y = increase(y)
  println("Incrementado y: " + y)
  //Asignamos a otro identificador
  val aaa = increase

  println("increase using aaa: " + aaa(2))

  increase = (x: Int) => x + 99


}
