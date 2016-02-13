val list = List("A","B","C")

("*"::list).reverse.init


list.init.splitAt(0)._2.tail


(list.reverse ::: list.reverse).take(4)

list.init ::: list.drop(1).init ::: list.drop(2).init

List(List(1,2,3,4), List(5,6)).mkString("#")


List(1).mkString("#")

val xs = List(1,2,3,4,5)
xs.reverse.take(xs.length - 2).reverse

xs.drop(2)

List()