package golovach.operators.infixtypes.quizes

object Quiz1 extends App {
  def f(x: Int ++ String ** Boolean): String = x.a.b

  def f1(x: Int ++ (String ** Boolean)): String = x.b.a

  def f2(x: Int +: String *: Boolean): String = x.b.a

  def f3(x: (Int +: String) *: Boolean): String = x.a.b

//  def f4(x: Int +: String ** Boolean): String = does not compile
//def f(x: Int ++ String *: Boolean): String = ### does not compile
}

case class ++[A, B](a: A, b: B)
case class **[A, B](a: A, b: B)
case class +:[A, B](a: A, b: B)
case class *:[A, B](a: A, b: B)