package oderskybook.chapter19

trait Queue[+T] {
  def head:T
  def tail:Queue[T]
  def enqueue[Q >: T](elem:Q):Queue[Q]
}
