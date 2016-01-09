package oderskybook.chapter13

class Rocket {
  import Rocket.fuel

  private def canGoHome = fuel > 20
}

object Rocket {
  private def fuel = 10

  def chooseStrategy(rocket:Rocket) : Unit = {
    if (rocket.canGoHome)
      goHome()
    else
      pickAStar()
  }

  def goHome():Unit = {}
  def pickAStar():Unit = {}
}

// class Rocket has access to private members of companion object and companion object has access to class private members
