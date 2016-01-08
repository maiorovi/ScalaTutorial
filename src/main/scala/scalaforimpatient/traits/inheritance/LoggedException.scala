package scalaforimpatient.traits.inheritance

import scalaforimpatient.traits.Logger

trait LoggedException extends Exception with Logger {
  def log():Unit = {log(getMessage)}
}
