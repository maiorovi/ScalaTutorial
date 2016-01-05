package oderskybook.chapter12

import investigation.Reflector

object PhilosophicalDemo extends App {
  Reflector.reflect(Philosophical.frog.getClass)

  val frog:Philosophical =  Philosophical.frog

  frog.philosofize()
}
