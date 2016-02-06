package golovach.variance

object Demo0 {
  // - class One[+T](var value:T)
  // - class One0[-T](var value:T)

  // + class One[T](var value:T)
  // + class One[T](val value:T)


  // + class One[+T](val value:T)
  // - class One[-T](val value:T)
}
