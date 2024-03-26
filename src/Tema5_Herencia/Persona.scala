package Tema5_Herencia

class Persona(val nombre: String, val edad: Int) {
  def presentarse(): Unit = println(s"Hola mi nombre es $nombre  y tengo $edad años")
}
