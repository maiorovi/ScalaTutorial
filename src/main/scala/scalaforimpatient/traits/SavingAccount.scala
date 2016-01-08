package scalaforimpatient.traits

class SavingAccount extends Account with Logger {
  def withdraw(amount:Double): Unit ={
    log(s"Give me withdraw ${amount}")
  }
}
