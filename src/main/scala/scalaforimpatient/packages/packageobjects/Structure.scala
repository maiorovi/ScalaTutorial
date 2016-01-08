package scalaforimpatient.packages

package object people {
  val defaultName = "John"
}

package people {
  class Person {
    var name = defaultName
  }
}


/*
A package can contain classes, objects, and traits, but not the definitions of functions or variables.
That’s an unfortunate limitation of the Java virtual machine. It would make more sense to add utility functions or
constants to a package than to some Utils object. Package objects address this limitation.
Every package can have one package object. You define it in the parent package, and it has the same name as the child package. For example,
 */