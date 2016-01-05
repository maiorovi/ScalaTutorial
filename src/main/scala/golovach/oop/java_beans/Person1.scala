package golovach.oop.java_beans

import scala.beans.BeanProperty

//We have another ability to create scala class which follows java bean standard
// we should use @BeanProperty annotation
// using this annotation we can`t suppress generation of scala`s mutators and accessors
class Person1 {
  @BeanProperty var age:Int = 10
}
