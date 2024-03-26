package Tema2

object ArreglosV2 extends App{
  var strList: List[String] = List("bob", "alice", "carol")
  var strList2: List[String] = List("denisse", "mario")

  println(strList.::(strList2)) // se hace una lista cque tiene como elementos otra lista y los elementos de la primer lista
  println(strList::(strList2)) // lo mismo que arriba pero invirtiendo el orden
  println(strList.:::(strList2)) // se hace una nueva lista con todos elementos

  var rangeLst = List.range(1,10) // lista con una rango de 1 a 10 no se incluye al 10
  println(rangeLst)

  var rangeLst2 = List.range(1,10,2) //Lista creada a partir de un rango pero ahora con pasos de 2
  println(rangeLst2)



}
