name := "account backend"
version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= {
  val akkaVersion = "2.3.12"
  val akkaStreamsVersion = "1.0"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-stream-experimental" % akkaStreamsVersion withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-http-core-experimental" % akkaStreamsVersion withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-http-experimental" % akkaStreamsVersion withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaStreamsVersion withSources() withJavadoc(),
    "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0" withSources() withJavadoc(),
    "io.spray" %% "spray-json" % "1.3.2" withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion withSources() withJavadoc(),
    "com.typesafe.akka" %% "akka-http-testkit-experimental" % akkaStreamsVersion withSources() withJavadoc(),
    "org.scalatest" %% "scalatest" % "2.2.4" withSources() withJavadoc(),
    "ch.qos.logback" % "logback-classic" % "1.1.3" withSources() withJavadoc()
  )
}