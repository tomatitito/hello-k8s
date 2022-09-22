ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "org.jensi"
ThisBuild / version := "1.0"

lazy val root = (project in file(".")).
  settings(
    name := "hello-k8s",
  )
  .settings(
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1",
      "io.kubernetes" % "client-java" % "16.0.0"
    )
  )
