package main.scala.golovach._14

sealed trait Tree[+A]
case class Leaf[+A](value:A) extends Tree[A]
case class Node[A](left:Tree[A], right:Tree[A])
