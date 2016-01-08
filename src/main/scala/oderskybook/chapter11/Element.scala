package oderskybook.chapter11
import Element.elem

abstract class Element {
  def contents : Array[String]
  def height: Int = contents.length
  def width: Int = if (contents.length == 0) 0 else contents(0).length

  def beside(that:Element):Element = {
    val this1 = this heighten that.height
    val that1 = that heighten this.height
    elem(for ((line1, line2) <- this1.contents zip that1.contents)
          yield line1 + line2)
  }

  def above(that:Element):Element = {
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.contents ++ that1.contents)
  }

  def widen(w:Int):Element = {
    if (w <= width) this
    else {
      val left = elem(' ', (w - width) / 2, height)
      var right = elem(' ', w - width - left.width, height)
      left beside this beside right
    }
  }

  def heighten(h:Int):Element = {
    if (h <= height) this
    else {
      val top = elem(' ', width, (h - height) / 2)
      var bottom = elem(' ', width, (h - height - top.height) )
      top above this above bottom
    }
  }

  override def toString = contents mkString "\n"
}

object Element {

  def elem(cont:Array[String]):Element = new ArrayElement(cont)

  def elem(cont:String):Element = new LineElement(cont)

  def elem(ch:Char, width:Int, height:Int): Element = new UniformElement(ch, width, height)

  private class ArrayElement(val contents: Array[String]) extends Element

  private class UniformElement(ch:Char,
                               override val width:Int,
                               override val height:Int) extends Element {
    private val line: String =  ch.toString * width
    def contents: Array[String] = Array.fill(height)(line)
  }

  private class LineElement(line:String) extends Element {
    def contents = Array(line)
    override def width = line.length
    override def height = 1
  }

}
