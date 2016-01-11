package oderskybook

/*
The type of a value parameter may be prefixed by =>, e.g. x: => T . The type of
such a parameter is then the parameterless method type => T . This indicates that
corresponding parameter is not evaluated at the point of function application,
but instead is evaluated at each use within the function. That is, the argument is
evaluated using call-by-name.
The by-name modifier is disallowed for parameters of classes that carry a val or
var prefix, including parameters of case classes for which a val prefix is implicitly
generated. The by-name modifier is also disallowed for implicit parameters
 */

object ParametersInScala extends App{

  def delayedByValue(time:Long):Long = {
    println("In method delayed")
    println(s"Param: $time")
    time
  }

  def delayedByName(time: => Long):Long = {
    println("In method delayed by name")
    println(s"Param: $time")
    time
  }

  def nano():Long = {
    println("getting nano")
    System.nanoTime()
  }

  println(delayedByValue(nano()))
  println()
  println(delayedByName(nano()))
}
