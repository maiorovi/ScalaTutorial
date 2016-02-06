package oderskybook.chapter19

class SlowAppendQueue[T](val list:List[T]) extends Queue[T] {
  override def head: T = list.head
  override def tail:SlowAppendQueue[T] = new SlowAppendQueue[T](list.tail)
  override def enqueue(elem:T):Queue[T] = new SlowAppendQueue[T](list ::: List(elem))
}
