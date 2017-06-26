val dottyVersion = "0.1.2-RC1"

lazy val root = (project in file(".")).
  settings(
    name := "scala-dummy-dotty",
    version := "0.1",

    scalaVersion := dottyVersion,

    libraryDependencies += "ch.epfl.lamp" % "dotty-compiler_0.1" % dottyVersion,
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"
  )
