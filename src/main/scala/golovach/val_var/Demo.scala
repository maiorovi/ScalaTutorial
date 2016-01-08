package golovach.val_var

/**
  * Created by egor on one/one/16.
  */
class Demo {
  var m_field:Int = 0 //mutable field
  val i_field: Int = 0 //immutable field

  // method parameter values are immutable
  def f(x:Int, y:Int) = {
    var m_local = 0 // mutable local variable
    val i_local = 0 //immutable local variable
  }
}
