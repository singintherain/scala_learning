package com.lvsong.domain.function

/**
 * Created by lvsong on 12/11/15.
 */
object App {
  def startUp {
    println("app startUp")
  }
}
trait Component {
  val server = {
    App.startUp
  }
}
object ParamFunc {
  def main(args: Array[String]) {
    new Component {}.server
  }
}
