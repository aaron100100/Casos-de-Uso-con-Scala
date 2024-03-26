package Tema5_Herencia

object Spidertraits extends App{
  trait Tobey{
    def SaveMJ(): Unit = println("Salvar a Mary Jane")
  }

  trait Andrew{
    def createWebs(web: String): Unit
  }

  trait Tom{
    val ucm: Boolean

  }

  class Spiderman extends Tobey with Andrew with Tom{
    def createWebs(web: String): Unit = println(web)
    override val ucm: Boolean = true
  }

  val sp = new Spiderman

  sp.SaveMJ()
  sp.createWebs("creando telas")
  println(sp.ucm)
}
