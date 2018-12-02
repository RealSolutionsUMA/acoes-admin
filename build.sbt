name := """acoes-admin"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies ++= Seq(
  guice,
  javaJpa,
  "com.h2database" % "h2" % "1.4.197",
  "org.hibernate" % "hibernate-core" % "5.2.17.Final",
  javaWs % "test",
  "javax.ejb" % "ejb-api" % "3.0" % "provided"
)
