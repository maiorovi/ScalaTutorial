package scalaforimpatient.overriding

class Person(val name:String) {
  override def toString: String = name
}


class SecretAgent(codeName:String) extends Person(codeName){
  override val name = "secret"
  override val toString = "secret"
}

object PersonDemo extends App {
  val agent = new SecretAgent("Qeen")
  println(agent.name)
  println(agent.toString)

}