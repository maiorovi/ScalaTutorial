package oderskybook.chapter12.queue

trait Incrementing extends IntQueue {
  abstract override def put(x:Int):Unit = { super.put(x + 1)}
}
