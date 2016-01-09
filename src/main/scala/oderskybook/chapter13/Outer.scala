package oderskybook.chapter13

class Outer {
  class Inner {
    private def f() = { println("f")}
    class InnerMost {
      f()
    }
  }

//  (new Inner).f() - will not compile. f is invisible here
//  However if we declare this methid as private[Outer] def f() = { println("f")} it will be accessible here
}
