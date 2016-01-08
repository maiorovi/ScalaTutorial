package oderskybook.chapter12

//once a trait defined it can be mixed in to a class using extend keyword or with
trait Philosophical {
  def philosofize(): Unit = {
    println("I consume memory therefore I`am!!")
  }
}

trait HasLegs
class Animal

object Philosophical {
  def frog:Frog = new Frog
}


// class frog subclasses AnyRef and MixIn Philosophical
class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"
}

// inside a trait you can define any parameters you can define in class
// but there is two major differences between trait and class:
// one. You cant use "class" parameters -> following will not compile -> trait NoPoint(x:Int, y:Int)
// 2. In class super call are statically bound whereas in trait super call are dynamically bound

// Traits help us to turn thin interface into rich interface. And rich interfaces is almost always preferable.
//
