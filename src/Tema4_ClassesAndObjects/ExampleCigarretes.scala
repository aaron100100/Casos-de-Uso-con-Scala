package Tema4_ClassesAndObjects

object ExampleCigarretes extends App{


  case class Customer(age: Int)

  class Cigarettes

  case class UnderAgeException(message: String) extends Exception(message)
    def buyCigarettes(customer: Customer): Cigarettes =
      if ( customer.age < 16 ){
        throw  UnderAgeException(s"Customer must be older that 16 but was ${customer.age}")
      }else{
        new Cigarettes
      }

    def youngCustomerBuy: String = {
      val youngCustomer = Customer(30)
      try{
        buyCigarettes(youngCustomer)
        "Yo, here are your cancer sticks! Happy smokin"
      }
      catch {
        case UnderAgeException(msg) => msg
      }
    }
  print(youngCustomerBuy)

}
