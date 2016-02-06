package oderskybook.chapter19

class FunctionalQueue[+T]private (private val leading:List[T], private val trailing:List[T]) extends Queue[T] {

  override def head: T = mirror.head

  private def mirror:FunctionalQueue[T] = if (leading.isEmpty) new FunctionalQueue[T](trailing.reverse, Nil) else this

  override def tail: Queue[T] = {
    val q = mirror
    new FunctionalQueue[T](q.leading.tail,q.trailing)
  }

  override def enqueue[Q >: T](elem: Q): Queue[Q] = new FunctionalQueue[Q](leading, elem::trailing)
}


object FunctionalQueue {
  def apply[T](elems:T*) = new FunctionalQueue(elems.toList, Nil)
}


// we can`t make queue covariant in type T because this type is used in contrvariant position
// but there is work around