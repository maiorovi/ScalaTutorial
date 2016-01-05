package golovach.oop.uniform_access_principle


/*
When we follow uniform access principle for data and methods we can easily substitute propeties with
some computation without affecting client.
 */

class Demo1 {
//  val property = 45
  def property : Int = {
  //some expensive and hard computations
  val x = 45
  val y = x + 1
  y
  }
}


object Demo1Test extends App {
  new Demo1().property
}


/*
The uniform access principle states that variables and parameterless functions should be accessed using the same syntax.
Scala supports this principle by not allowing parentheses to be placed at call sites of parameterless functions.
As a result, a parameterless function definition can be changed to a val, or vice versa, without affecting client code.
 */

/*
https://en.wikipedia.org/wiki/Uniform_access_principle
 */