package golovach._5_array_generics

object Demo {
  //Arrays
  //public final int[]  arr =  new int[] {one,2,3,4,5,6}
  val arr: Array[Int]  = Array(1,2,3,4)

  var eleme2:Int = arr(2)

  //generics
  val list:List[Int] = List(1,2,3,4)
  var elem3 = list(3)
}
