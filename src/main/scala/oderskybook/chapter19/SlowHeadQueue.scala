package oderskybook.chapter19

class SlowHeadQueue[+T](val smele:List[T]) extends Queue[T] {

  override def head: T = smele.last

  override def tail: Queue[T] = new SlowHeadQueue[T](smele.init)

  override def enqueue[U >: T](elem: U): Queue[U] = new SlowHeadQueue[U](elem::smele)
}
