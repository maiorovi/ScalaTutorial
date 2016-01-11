package oderskybook.chapter18

class Thermometer {
  var celcius:Float = _

  def fahrenheit = celcius * 9 / 5 + 32
  def fahrenheit_=(temp:Float) = celcius = (temp - 32) * 5 / 9
}
