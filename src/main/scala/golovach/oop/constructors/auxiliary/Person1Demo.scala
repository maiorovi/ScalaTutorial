package golovach.oop.constructors.auxiliary

object Person1Demo extends App {
  new Person1()
  new Person1(45)
  new Person1(name = "Sw") // this is named parameters. and in this case we doesn`t need to follow arguments order in constructor declaration
  new Person1(23, "ws")
}
