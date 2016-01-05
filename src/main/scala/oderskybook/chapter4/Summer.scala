package oderskybook.chapter4

object Summer {
// interpolation in action. to create processed string you need to prepend it with 's' character
  def main(args:Array[String]): Unit = {
    import ChecksumAccumulator.calculate

    for (arg <- args) {
      println(s"$arg : ${calculate(arg)}")
    }
  }

}
