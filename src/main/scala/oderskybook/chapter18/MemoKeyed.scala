package oderskybook.chapter18

class MemoKeyed extends Keyed {
  private var cache:Option[Int] = Option.empty

  override def computeKey:Int = {
    if (cache.isEmpty) cache = Some(super.computeKey)
    cache.get
  }

}

// class memoKeyed left immutable despite there is a var declaration in the MemoKeyed. The reason is that keyed is immutable class