1 + 2

println("Hello World!")
// val is constant. you can`t reassign a val
val msg = "Hello, World!"

val msg3:String = "Hello yet again, world!"

println(msg3)

//if you need reassignment prefer vars

var msg4 = "Happy new Year"

msg4 = "Happy new 2016 Year!!"

// lets define some functions

def max(x:Int, y:Int) = if (x > y) x else y

max(3,4)

max(6,2)

max(4,4)

def greet() = println("Hello World")

greet()
