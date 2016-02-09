package oderskybook.chapter19

class SlowAppendQueue[T](val list:List[T]) extends Queue[T] {
  override def head: T = list.head
  override def tail:SlowAppendQueue[T] = new SlowAppendQueue[T](list.tail)
  override def enqueue[Q >: T](elem:Q):Queue[Q] = new SlowAppendQueue[Q](list ::: List(elem))
}
