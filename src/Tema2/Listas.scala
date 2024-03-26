package Tema2

object Listas extends App {
  var strList: List[String] = List("bob", "alice", "carol")
  var strList2: List[String] = List("denisse", "mario")

  //println(strList.::(strList2))

  val numbers = List(1,2,3,4,5,6,7,8,9)
  //println(numbers.filter(_%2 == 0))

  val listNums: List[Double] = List(1,2,6,5,5,6,4)


  def sumList(list: List[Double]): Double = {
    if(list.isEmpty) 0.toDouble
    else list.head + sumList(list.tail)
  }

  def max(x: Int, y:Int): Int = {
    if( x > y) x else y
  }

  //println(max(10,20))
  //println(max(max(10,20), max(50,49)))

  def getDayOfWeek(day: Int): String = {
    day match {
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Friday"
      case 6 => "Saturday"
      case 7 => "Sunday"
      case _ => "Invalid Day"
    }
  }
  //println(getDayOfWeek(5))
  //println(getDayOfWeek(9))



  //Enteros
  val num = 255
  val hexNum = 0x00FF

  //Longs
  val longValue = 1L

  //Doubles
  val doubleValue = 3.1416

  //Floats
  val floatValue = 1.6164f



  //println(3 + 3 * 2 /3)
  //println((3 + 3) * 2 / 3)

  //println(true)
  //println(false)

  var x = 10
  x = 20


  def circleArea(radius: Double): Unit = {
    val area = radius * radius * 3.141592
    println(s"The area of a circle with radius $radius is $area")
  }
  def multipleArgs(params: Int*) = {
    println(s"Concatenated args = ${params.mkString("-")}")
  }
  /*
  multipleArgs()
  multipleArgs(1)
  multipleArgs(1,2)*/



  def f(n: Int) = (n * (n + 1))/2

  println(f(3))








}
