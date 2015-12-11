package com.lvsong.domain.trait_p

/**
 * Created by lvsong on 12/11/15.
 */
trait Executor {
  def main (args: Array[String]){
    println("executor in trait")
  }
}

class Car extends Executor {

}

object MainTrait extends Executor{
  val car = new Car
}
