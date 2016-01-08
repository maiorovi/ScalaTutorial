package golovach.oop.fields

/**
  * Created by egor on one/2/16.
  */
class Person0 {
  //  var age:Int //not defaults! => abstract field
  var age:Int = _ //default value will be stored in age
//  var age:Int = one // here we place default value for the field

}


object Demo extends App {
  println(new Person0().age)
}
