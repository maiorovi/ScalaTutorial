package golovach.oop.java_beans

// lets build scala class for usage in java code. So this class should follow java naming conventions e.t.c
// here is how can we reach this
class Person0 {
  private[this] var age:Int = 0

  def getAge : Int = age

  def setAge(age:Int) : Unit = this.age = age
}
