package oderskybook.chapter19

object MergeSort extends App {

  def mergeSort[T <: Ordered[T]](xs: List[T]): List[T] = {
    if (xs.length <= 1) {
      xs
    } else {
      def merge(left: List[T], right: List[T]): List[T] = (left, right) match {
        case (Nil, y :: ys) => y :: merge(Nil, ys)
        case (x :: xs, Nil) => x :: merge(xs, Nil)
        case (x :: xs, y :: ys) => if (x > y) x :: merge(xs, y :: ys) else y :: merge(x :: xs, ys)
        case (_,_) => Nil
      }

      val (left, right) = xs.splitAt(xs.length / 2)
      merge(mergeSort(left), mergeSort(right))
    }
  }

  println(mergeSort(List(Person("Egor",25),Person("Julia",27),Person("Ivan", 5))))
}

case class Person(val name:String, val age:Int) extends Ordered[Person] {
  override def compare(that: Person): Int = that.age - this.age
}
