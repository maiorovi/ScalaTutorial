package oderskybook.chapter16

object InsertionSort extends App {

  def isort[T <: Ordered[T]](xs:List[T]):List[T] = if (xs.isEmpty) Nil else insert(xs.head, isort(xs.tail))

  def insert[T <: Ordered[T]](x:T, xs:List[T]):List[T] = if (xs.isEmpty || xs.head <= x) x::xs else xs.head :: insert(x, xs.tail)
}

//there is another approach to implement insertion sort using pattern matching

object AnotherInsertionSortImpl {

  def isort[T <: Ordered[T]](xs:List[T]):List[T] = xs match {
    case List() => List()
    case x::xs => insert(x, isort(xs))
  }

  def insert[T <: Ordered[T]](x:T, xs:List[T]):List[T] = xs match {
    case _ if (xs.isEmpty || x <= xs.head) => x::xs
    case x::xs => xs.head :: insert(x, xs.tail)
  }

}
