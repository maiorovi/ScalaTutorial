package main.scala.golovach._14

trait Nat
case object One extends Nat
case class Succ(x:Nat) extends Nat


object Operations extends App {

  def transformToInt(x:Nat): Int = x match {
    case One => 1
    case Succ(t) => 1 + transformToInt(t)
  }

  def add(x:Nat, y:Nat): Nat = x match {
    case One => Succ(y)
    case Succ(t) => add(t,Succ(y))
  }

  def mult(x:Nat, y:Nat):Nat = x match {
    case One => y
    case Succ(t) => add(y, mult(t,y) )
  }

  def pow(x:Nat, y:Nat):Nat = y match {
    case One => x
    case Succ(t) => mult(x, pow(t,x))
  }

  val _5 = Succ(Succ(Succ(Succ(One))))
  val _3 = Succ(Succ(One))


  println(transformToInt(_3))
  println(transformToInt(_5))
  println(transformToInt(add(_5,_3)))
  println(transformToInt(mult(_5,_3)))
  println(transformToInt(pow(_5,_3)))
}






