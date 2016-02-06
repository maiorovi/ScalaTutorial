package oderskybook.chapter19

class Cell[T](init:T) {
  private[this] var current = init

  def get:T = current

  def set(value:T):Unit = current = value
}


/*
class Cell[+T](init:T) {
...
}

This definition is not possible in scala because we can write the follwoing series of statements
val s = new Cell[String]("one")
val c: Cell[Any] = s
c.set(1)
val str:String = s.get

we end up setting to string an integer. what statement should we blame? Answer is the second one
The reason is that you can do some stuff with Cell[Any],  but you can`t do the same stuff with Cell[String]

 */