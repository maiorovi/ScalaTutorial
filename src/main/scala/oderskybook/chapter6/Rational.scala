package oderskybook.chapter6

class Rational(n:Int, d:Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)
  private val numer = n / g
  private val denom = d / g

  def this(numer:Int) = this(numer, 1)

  override def toString():String = s"$numer/$denom"

  def +(that: Rational): Rational = new Rational(numer * that.denom + that.numer * denom, denom*that.denom)
  def +(that:Int): Rational = new Rational(numer + that*denom, denom)

  def *(that:Rational): Rational = new Rational(numer * that.numer, denom * that.denom)
  def *(that:Int): Rational = new Rational(that * numer, denom)

  def -(that:Rational): Rational = new Rational(numer * that.denom + that.numer * denom, denom*that.denom)
  def -(that:Int): Rational = new Rational(numer - that*denom, denom)

  def /(that:Rational): Rational = new Rational(numer * that.denom, that.numer * denom)
  def /(that:Int): Rational = new Rational(numer, denom * that)

  def lessThan(that:Rational):Boolean = this.numer * that.denom < this.denom * that.numer
  def max(that:Rational):Rational = if (this.lessThan(that)) that else this

  private def gcd(fst:Int, snd:Int):Int = if (snd == 0) fst else gcd(snd, fst % snd)
}

object Rational {
  implicit  def toRational(x:Int):Rational = new Rational(x)
}
