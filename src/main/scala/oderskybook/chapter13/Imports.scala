package oderskybook.chapter13
//easy access to File. Imports File from package java.io
import java.io.File
// imports all contents of package java.util.zip
import java.util.zip._
//rename the HashMap
import java.util.{HashMap => JHashMap}
// exclude some class from the import
import oderskybook.chapter12.{Animal => _, _}


object Imports extends App {
  val file = new File("file")
  val javaMap = new JHashMap[String, String]()
  javaMap.put("name", "Egor")
  println(javaMap.get("name"))

  val animal = new Frog

  //val animal = new Animal {} cant use animal because it is excluded

}
