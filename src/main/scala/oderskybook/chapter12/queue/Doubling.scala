package oderskybook.chapter12.queue

//funny things
// one. trait extends super class
// 2. we have a call to super`s put method
trait Doubling extends IntQueue {
  abstract override def put(elem: Int): Unit = { super.put(2 * elem)}
}
