package Tema2

object Conjuntos {
  def main(args: Array[String]): Unit = {
    val set1 = Set('a','b','c')
    val set2 = Set('c','d','e')

    println(set1.union(set2))
    println(set1.intersect(set2))
  }

}
