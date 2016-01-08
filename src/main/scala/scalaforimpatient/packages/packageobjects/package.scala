package scalaforimpatient.packages


package object packageobjects {
  def gcd(x:Int, y:Int):Int = if (y == 0) x else gcd(y, x % y)
}

/*
Behind the scenes, the package object gets compiled into a JVM class with static methods and fields, called
package.class, inside the package. In our example, that would be a class com.horstmann.impatient.people.package
with a static field defaultName. (In the JVM, you can use package as a class name.)
It is a good idea to use the same naming scheme for source files. Put the package object into a file
com/horstmann/impatient/people/package.scala. That way, anyone who wants to add functions or variables to
 a package can find the package object easily.
 */
