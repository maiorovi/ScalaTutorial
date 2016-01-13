package golovach.operators

//infix form == "pointless style" != "point free style"
object PointsStyle extends App {
  val cos: Double => Double = Math.cos
  val sin: Double => Double = Math.sin

  // it is not point free style
  val f: Double => Double = x => cos(sin(x))

  //pointless style
  val g: Double => Double = cos compose sin

  //pointless style is when arg uments is not used for function definition
}
