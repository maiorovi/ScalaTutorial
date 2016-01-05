package scalaforimpatient

import scala.collection.mutable.ArrayBuffer

class Network {

  class Member(val name:String) {
    val contacts = new ArrayBuffer[Member]
  }

  private val members = new ArrayBuffer[Member]

  def join(name:String):Member = {
    val m = new Member(name)
    members += m
    m
  }

}

object NetworkDemo extends App {
  val one = new Network
  val two = new Network

  val fred = one.join("fred")
  val jul = one.join("jul")

  fred.contacts += jul

//  fred.contacts += iva // will not compile cose every class have its own version of member class
  val iva = two.join("iva")

}
