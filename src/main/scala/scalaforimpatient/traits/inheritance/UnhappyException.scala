package scalaforimpatient.traits.inheritance

class UnhappyException extends LoggedException {
  override def getMessage() = "argh!!!"
}
