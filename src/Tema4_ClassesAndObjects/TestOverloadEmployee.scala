package Tema4_ClassesAndObjects

object TestOverloadEmployee extends App{
  println("Salida 1")
  var emp1 = new OverloadEmployee()

  println("Salida 2")
  var emp2 = new OverloadEmployee(1000)

  println("Salida 3")

  var emp3 = new OverloadEmployee(1000, "Overloading")

}

class OverloadEmployee(val empId: Int = 0, val empName: String = ""){
  println("[Primer Constructor]")
  println("EmpId = " + (empId == 0))
  println("Empname = " + empName.isEmpty)
}
