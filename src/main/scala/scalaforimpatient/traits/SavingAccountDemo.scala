package scalaforimpatient.traits

object SavingAccountDemo extends App {
  val acc = new SavingAccount
  acc.withdraw(100)

  val acc1 = new SavingAccount with ConsoleLogger
  acc1.withdraw(200)
}
