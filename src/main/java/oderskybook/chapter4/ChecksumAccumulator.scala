package oderskybook.chapter4

class ChecksumAccumulator {
  private[this] var sum:Int = 0

  def add(b:Byte):Unit = sum += b

  def checksum():Int =  ~(sum & 0XFF) + 1

}

object ChecksumAccumulator {
  import scala.collection.mutable.Map

  private val cache = Map[String,Int]()

  def calculate(s:String) : Int = {
    if (cache.contains(s)) {
      cache(s)
    } else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }

}

object Demo extends App {
  val acc = new ChecksumAccumulator
  val csd = new ChecksumAccumulator

//  println (acc.sum) won`t compile
  println(ChecksumAccumulator.calculate("a"))
}