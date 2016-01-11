package oderskybook.chapter18

class Time {
  private[this] var h = 12
  private[this] var m = 0

  def hour = h
  def hour_=(hour:Int) = {
    require(0 < h && h < 24)
    h = hour
  }

  def minute = m
  def minute_=(minute:Int) = {
    require(0 < m && m < 60)
    m = minute
  }
}
