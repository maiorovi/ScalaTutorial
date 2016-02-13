package scalabyexample.types

abstract class Stack[A] {
  def push(x:A) = new NonEmptyStack(x, this)
  def pop:A
  def isEmpty:Boolean
  def top:NonEmptyStack[A]
}

class EmptyStack[A] extends Stack[A] {
  override def pop: Int = error("EmptyStack.pop")

  override def top: NonEmptyStack = error("EmptyStack.top")

  override def isEmpty: Boolean = true
}

class NonEmptyStack[A](elem:A, rest:Stack[A]) extends Stack[A] {
  override def pop: A = elem

  override def top: Stack[A] = rest

  override def isEmpty: Boolean = false
}
