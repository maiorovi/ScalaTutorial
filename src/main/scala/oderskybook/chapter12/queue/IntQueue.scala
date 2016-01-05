package oderskybook.chapter12.queue

abstract class IntQueue {
  def put(elem:Int):Unit
  def dequeue():Int
}
