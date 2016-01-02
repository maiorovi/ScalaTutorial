package golovach.functions

/**
  * Created by egor on 1/1/16.
  */
class Demo {

  // scala method in java style
  def f0(x:Int, y:Int):Int = {
    return x*x + y*y;
  }

  //semicolon inference
  def f1(x:Int, y:Int):Int = {
    return x*x + y*y
  }

  //last statement is return
  def f2(x:Int, y:Int):Int = {
    x*x + y*y
  }

  // return type inference
  def f3(x:Int, y:Int) = {
    x*x + y*y
  }

  // can descope curly braces
  def f4(x:Int, y:Int) = x*x + y*y

  //using inner(nested) function
  def f5(x:Int, y:Int) = {
    def sqr(t:Int) = t*t

    sqr(x) + sqr(y)
  }
}

//method is a part of class interface while function separate concept in limited area
