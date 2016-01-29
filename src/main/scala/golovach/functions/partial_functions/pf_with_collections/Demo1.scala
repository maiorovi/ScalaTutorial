package golovach.functions.partial_functions.pf_with_collections

object Demo1 extends App {
  // match error should happen
  List(0,1,2).map {case 1 => "One"
                   case 2 => "Two"
  }
}
