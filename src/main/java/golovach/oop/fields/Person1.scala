package golovach.oop.fields

// all scala classes by default extends any ref
// how to create our own accessor and mutators
// 1. make field private / private[this]
// 2. rename field
// 3. create field accessor def fieldName : fieldType = {...}
// 4. create field mutator def fieldName_$eq(newValue:FieldType) : Unit = {...}
class Person1 extends AnyRef {
  private[this] var privateAge:Int = _

  def age : Int = {
    println("Hello from accessor!")
    privateAge
  }

  def age_$eq(value : Int) : Unit = {
    println("Hello from mutator!")
    privateAge = value;
  }
}
