package com.alangeorge.accounts

import com.typesafe.config.ConfigFactory

trait Configuration {
  val config = ConfigFactory.load()

  val serviceInterface = config.getString("server.interface")
  val servicePort = config.getInt("server.port")
}
