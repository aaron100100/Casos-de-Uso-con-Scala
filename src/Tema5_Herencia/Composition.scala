package Tema5_Herencia

object Composition extends App{
  class Spider_man(lanzador: Lanzatelarana, moto: Moto){
    val spiderweb: Lanzatelarana = lanzador
    val spidermoto: Moto = moto


    println(spiderweb.lanzar)
    println(spiderweb.dispositivo)
    println(spidermoto.driving)
  }

  class Lanzatelarana{
    val dispositivo: String = "lanzador"

    def lanzar(): String = {
      "Lanzando telarañas"
    }
  }

  class Moto{
    def driving(): String = {
      "Driving Moto"
    }
  }

  class SuperHero{
    val marvel: String = "!Super heroe de Marvel"
  }
  class Spiderman extends SuperHero{
    println(marvel)
  }
  class Ironman extends SuperHero{
    println(marvel)
  }

  new Spider_man(new Lanzatelarana, new Moto)

  new Spiderman
  new Ironman
}
