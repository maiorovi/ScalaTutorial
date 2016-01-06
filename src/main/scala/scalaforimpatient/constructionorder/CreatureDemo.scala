package scalaforimpatient.constructionorder

object CreatureDemo extends App {
  val ant = new Ant

  println(ant.env.length)

  val bug = new Bug

  println(bug.env.length)
}

//You can debug construction order problems with the -Xcheckinit compiler flag