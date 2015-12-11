package com.lvsong.domain.trait_p


/**
 * Created by lvsong on 12/11/15.
 */
trait Log {
  def log(msg: String){}
  val name = "testParam"
}

trait ConsoleLogger extends Log {
  override def log(msg: String) {
    println("console logger")
    println(msg) }
}

trait FileLogger extends Log {
  override def log(msg: String): Unit = {
    println("file logger")
    println(msg)
  }
}

class CreateAccount extends Log {
  def withdraw(account: Double): Unit = {
    log("提取金额: " + account)
  }

}

object app {
  def main(args: Array[String]): Unit = {
    var createAccount = new CreateAccount
    createAccount.withdraw(20.0)

    val createAccountFileLog = new CreateAccount with FileLogger
    createAccountFileLog.withdraw(30.0)

    val createAccountConsoleLog = new CreateAccount with ConsoleLogger
    createAccountConsoleLog.withdraw(40.0)
  }
}
