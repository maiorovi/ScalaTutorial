//list concatenation associates to the right
val xs, ys, zs = List(1,2,3,4,5)
xs ::: ys ::: zs
// is the same as

xs ::: (ys ::: zs)
def append[T](xs:List[T], ys:List[T]):List[T] = xs match {
  case List() => ys
  case x::xs => x :: append(xs,ys)
}



xs.foldLeft(0)( (acc, x) => acc + x)
(0 /: xs)(_ + _) // fold left operator


// implementation of reverse using fold left

def reverseLeft[T](xs:List[T]):List[T] = (List[T]() /: xs)((ys,y)=> y::ys)
