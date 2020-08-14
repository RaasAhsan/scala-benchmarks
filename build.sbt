
lazy val commonSettings = Seq(
  organization := "com.raasahsan",
  version := "0.1.0",
  scalaVersion := "2.13.3"
)

lazy val root = project.in(file("."))
  .settings(commonSettings)
  .settings(
    name := "scala-benchmarks"
  )
  .enablePlugins(JmhPlugin)
