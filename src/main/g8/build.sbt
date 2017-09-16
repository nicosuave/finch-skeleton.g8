import sbt._

scalaVersion := "$scala_version$"

// These options will be used for *all* versions.
scalacOptions ++= Seq(
  "-deprecation"
  , "-unchecked"
  , "-encoding", "UTF-8"
  , "-Yclosure-elim"
  , "-Yinline"
  , "-Xverify"
  , "-feature"
  , "-language:postfixOps"
)

val FinchVersion = "$finch_version$"
val CirceVersion = "$circe_version$"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1",
  "org.scalacheck" %% "scalacheck" % "1.13.5" % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "com.github.finagle" %% "finch-core" % FinchVersion,
  "com.github.finagle" %% "finch-circe" % FinchVersion,
  "io.circe" %% "circe-core" % CirceVersion,
  "io.circe" %% "circe-generic" % CirceVersion,
  "io.circe" %% "circe-jawn" % CirceVersion
)

fork := true

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

initialCommands in console := "import cats._, cats.data._, cats.implicits._"

resolvers ++= Seq(
  "TM" at "http://maven.twttr.com",
  "Typesafe Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/",
  "Secured Central Repository" at "https://repo1.maven.org/maven2",
  Resolver.sonatypeRepo("snapshots")
)
