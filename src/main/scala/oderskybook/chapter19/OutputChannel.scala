package oderskybook.chapter19

trait OutputChannel[-T] {
  def write(x:T)
}
