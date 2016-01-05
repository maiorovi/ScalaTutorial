import java.math.BigInteger

val big = new BigInteger("1234")

val greetings = new Array[String](3)

greetings(0) = "Hello"
greetings(1) = ", "
greetings(2) = "world!!\n"

//for(greet <- greetings)
//  print(greet)
for (i <- 0 to greetings.length - 1)
  print(greetings(i))

//lets create an array
val myArray = Array[Int](1,2,3,4,5,6)

//tuples

val pair = (45, "Lufthansa")
pair._1
pair._2

5.max(10)