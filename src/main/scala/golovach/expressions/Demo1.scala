package golovach.expressions

import scala.util.Random

// control flow
object Demo1 {
  //all language control constructions are expressions

  // branches: if, match
  val y0 = if (5 > 0) 5 else 0
  val y1 = new Random(5).nextInt match { case 0 => "0" }


  //loops
  val x0 = while(true) {}
  val x1 = do {} while(true)
  val x2 = for(k <- Array(1,2,3)) {}

  //exception handling: try
  val y2 = try {
    Some("123".toInt)
  } catch {
    case e:NumberFormatException => None
  }

  // control flow breaks:  throw, return
  val y6 = throw new Error
  def f():Int = {
    val q = return 0
    0
  }
  var x = 0

  x += 5

// from this expressions you can create expression composion. And expression composition is also expression!!!
}
