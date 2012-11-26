addSbtPlugin("com.typesafe" % "sbt-native-packager" % "0.4.3" withSources )

addSbtPlugin("play" % "sbt-plugin" % "2.0.4")

name := "play2-native-packager-plugin"

organization := "com.lunatech"

version := "0.2"

description := "Play2 plugin for producing native system distribution packages"

scalaVersion := "2.9.1"

sbtVersion := "0.11.3"

sbtPlugin := true

publishMavenStyle := true

pomExtra := (
  <url>https://github.com/lunatech-labs/play2-native-packager-plugin</url>
  <licenses>
  <license>
    <name>Apache 2</name>
    <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
    <distribution>repo</distribution>
  </license>
  </licenses>
  <scm>
    <url>git@github.com:lunatech-labs/play2-native-packager-plugin.git</url>
    <connection>scm:git:git@github.com:lunatech-labs/play2-native-packager-plugin.git</connection>
  </scm>
)

publishTo <<= version { (v) =>
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at "http://artifactory.lunatech.com/artifactory/snapshots-public")
  else
    Some("releases" at "http://artifactory.lunatech.com/artifactory/releases-public")
}
