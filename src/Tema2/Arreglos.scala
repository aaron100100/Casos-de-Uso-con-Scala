package Tema2

object Arreglos extends App {
  def insertSortForArrays(list:Array[Int]) = {
    var j = 1
    while( j < list.length){
      val key = list(j)
      var i = j - 1
      while( i >= 0 && list(i) > key ){
        list(i + 1) = list(i)
        i = i - 1
      }
      list( i + 1 ) = key
      j = j + 1
    }
    list

  }
  val array =Array(5,9,7,1,5,3,4,8,2,6)
  val orderedArray = insertSortForArrays(array)

}
