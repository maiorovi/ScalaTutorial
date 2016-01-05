package oderskybook.chapter12.queue

object IntQueueDemo extends App {
  val queue = new DefaultIntQueue
  queue.put(10)
  queue.put(20)

  println(queue.dequeue())

  val myQueue = new DefaultIntQueue with Doubling

  myQueue.put(30)

  println(myQueue.dequeue())

  val otherQueue = new DefaultIntQueue with Incrementing with Filtering

  otherQueue.put(-1)
  otherQueue.put(0)
  otherQueue.put(1)

  println(otherQueue.dequeue())
}
