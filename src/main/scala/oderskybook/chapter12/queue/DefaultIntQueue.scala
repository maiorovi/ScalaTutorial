package oderskybook.chapter12.queue

import scala.collection.mutable.ArrayBuffer

class DefaultIntQueue extends IntQueue {
  private val buffer = new ArrayBuffer[Int]()

  override def put(elem: Int): Unit = buffer += elem

  override def dequeue(): Int = buffer.remove(0)
}
