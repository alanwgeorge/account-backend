package com.alangeorge.accounts

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes._
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer

object Main extends App {
  implicit val system = ActorSystem()
  implicit val executor = system.dispatcher
  implicit val materializer = ActorMaterializer()

  val config = new Configuration {}

  val routes = {
    logRequest("root") {
      complete(OK)
    }
  }

  Http().bindAndHandle(routes, config.serviceInterface, config.servicePort)
}
