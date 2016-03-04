val func: Any => Any = {
  case (a,(b,c)) => func((a,b), c)
  case x => x
}


val func1: Any => Any = {
//  case (a:Tuple1, b ) =>func1((a._1))

  case x => x
}

def func2(n:Int):Seq = {

}

func((1,(2,(3,(4,5)))))

(1,2,3,4)
(1,(2,3,4))
((1,2),(3,4))
(1,2,(3,4))