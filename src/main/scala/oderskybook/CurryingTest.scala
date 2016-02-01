package oderskybook

object CurryingTest extends App {
  def m0(a:Int, b:Int) = a + b

  def m1(a:Int)(b:Int) = a + b


  println(m0(0,1)) // curring form is not allowed
  val func = m0(0, _) // partial application
  println(func(5))

  val func0 = m1(5)
  println(func0(6))
}
