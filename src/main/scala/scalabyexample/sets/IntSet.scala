package scalabyexample.sets

trait IntSet {
  def incl(x:Int):IntSet
  def contains(x:Int):Boolean
  def union(x:IntSet):IntSet
  def intersect(x:IntSet):IntSet
}

class EmptySet extends IntSet {
  def incl(x:Int) = new NonEmptySet(x, new EmptySet, new EmptySet)
  def contains(x:Int) = false
  def union(x:IntSet):IntSet = x
  def intersect(x:IntSet):IntSet = new EmptySet
  override def toString = ""
}

class NonEmptySet(var elem:Int, leftChild:IntSet, rightChild:IntSet) extends IntSet {

  def incl(x:Int):IntSet = {
    if (x > elem) new NonEmptySet(elem,leftChild,rightChild.incl(x))
    else if (x < elem) new NonEmptySet(elem, leftChild.incl(x), rightChild)
    else this
  }

  def contains(x:Int):Boolean = {
    if (x > elem) rightChild.contains(x)
    else if (x < elem) leftChild.contains(x)
    else true
  }

  def union(x:IntSet):IntSet = {
    if (x.contains(elem)) {
      rightChild.union(leftChild.union(x))
    } else {
      rightChild.union(leftChild.union(x.incl(elem)))
    }
  }

  def intersect(x:IntSet):IntSet = {
    if (x.contains(elem)) {
      rightChild.intersect(x).union(leftChild.intersect(x)).union((new EmptySet).incl(elem))
    } else {
      rightChild.intersect(x).union(leftChild.intersect(x))
    }

  }

  override def toString = elem + "," + leftChild.toString + rightChild.toString
}