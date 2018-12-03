name := """acoes-admin"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.11.12", "2.12.4")

libraryDependencies ++= Seq(
  javaJdbc,
  javaJpa,
  "org.mariadb.jdbc" % "mariadb-java-client" % "2.3.0",
  "org.hibernate" % "hibernate-core" % "5.3.7.Final",
  "com.h2database" % "h2" % "1.4.197",
  javaWs % "test",
  "javax.ejb" % "ejb-api" % "3.0" % "provided",
  guice,
)
