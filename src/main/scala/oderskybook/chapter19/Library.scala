package oderskybook.chapter19

class Publication(val title:String)

class Book(title:String) extends Publication(title)


object Library {
  val books:Set[Book] = Set(
    new Book("Programming in scala"),
    new Book("Walden")
  )

  def printBooks(info: Book => AnyRef):Unit = {
    for (book <- books)
      println(info(book))
  }
}

object Customer extends App {
  def getTitle(p:Publication) = p.title

  Library.printBooks(getTitle)
}
