package com.lvsong.domain.main

/**
 * Created by lvsong on 12/11/15.
 */
object AppMain extends App {

  if(args.length > 0) {
    println("Hello, " + args(0))
  } else {
    println("Hello, World!")
  }
}
