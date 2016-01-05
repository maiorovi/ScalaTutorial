package oderskybook.chapter12

//once a trait defined it can be mixed in to a class using extend keyword or with
trait Philosophical {
  def philosofize(): Unit = {
    println("I consume memory therefore I`am!!")
  }
}

// class frog subclasses AnyRef and MixIn Philosophical
class Frog extends Philosophical {
  override def toString = "green"
}
