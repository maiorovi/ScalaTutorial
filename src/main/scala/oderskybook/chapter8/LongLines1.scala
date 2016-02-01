package oderskybook.chapter8

import scala.io.Source

object LongLines1 {
  //the problem with the previous program is that we have function process line and this function
  // can be considered as helper function. There is not sense for this function with out process file function
  // we should consider an option to hide this from a client inside the process file function. We can use local function
  // for this purpose.

  // now we can go even further. We can refactor the processLine function using a fact thet local function has access to
  // all parameters of enclosing function.

  // so this is it:

  def processFile(fileName:String, len:Int):Unit = {
    Source.fromFile(fileName).getLines().foreach(line => processLine(line))

    def processLine(line: String): Unit = {
      if (line.length > len)
        println(s"Line in file $fileName exceeded the max width!")
    }
  }

}
