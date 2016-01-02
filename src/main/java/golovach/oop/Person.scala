package golovach.oop

/**
  * Created by egor on 1/2/16.
  */
class Person0 {
  //  var age:Int //not defaults! => abstract field
  var age:Int = _ //default value will be stored in age

}


object Demo extends App {
  println(new Person0().age)
}
