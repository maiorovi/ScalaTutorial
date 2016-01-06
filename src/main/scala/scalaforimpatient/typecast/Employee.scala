package scalaforimpatient.typecast

class Employee(val name:String,  val age: Int)

class Manager(name:String, age:Int) extends Employee(name, age)

object EmployeeDemo extends App {
  val emp:AnyRef = new Employee("John", 29)
  val manager:AnyRef = new Manager("Artas", 35)

  if (emp.isInstanceOf[Employee]) {
    val emp1 = emp.asInstanceOf[Employee]
    println(emp1.age)
  }

  if (manager.getClass == classOf[Manager]) {
    val manager1 = manager.asInstanceOf[Manager]
    println("manager is manager")
  }
}

//however in Scala it is better to use pattern matching then type checks and type casts
