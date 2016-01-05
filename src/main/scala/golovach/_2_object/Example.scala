package golovach._2_object

//companion class
class Example {
  def f(x:Int):Int = x + 1
}

//companion object
//all object members can be viewed as static members of class Example
object Example {
  def g(x:Int):Int = x + 1
}

object Demo {
  def main(args:Array[String]) {
    //java instance method
    println (new Example().f(10))
    //java class method
    println (Example.g(5))
  }
}



