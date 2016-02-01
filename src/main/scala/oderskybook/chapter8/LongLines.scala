package oderskybook.chapter8

import scala.io.Source

object LongLines {

//  def processFile(fileName:String, len:Int):Unit = {
//    val source = Source.fromFile(fileName)
//    for (line <- source.getLines()) {
//      processLine(line, len, fileName)
//    }
//  }


  // we can rewrite this using foreach
  // i think that this is much better approach

  def processFile(fileName:String, len:Int):Unit = Source.fromFile(fileName).getLines().foreach(line => processLine(line, len, fileName))

  // here we use private access modifier to hide this helper function from client
  private def processLine(line:String, width:Int, fileName:String):Unit = {
    if (line.length > width)
      println(s"Line in file $fileName exceeded the max width!")
  }
}
