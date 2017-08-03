name := """pureconfig-test"""

version := "0.1.0"

scalaVersion  := "2.11.4"

scalacOptions := Seq("-feature", "-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= Seq(
  "com.github.pureconfig" %% "pureconfig" % "0.7.2"
)

libraryDependencies += "com.typesafe" % "config" % "1.3.0"
