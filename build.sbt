organization := "io.github.samanos"
name := "gpio"

scalaVersion := "2.11.8"
scalacOptions += "-feature"

val Akka = "2.4.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka"    %% "akka-actor"                     % Akka,
  "com.github.pathikrit" %% "better-files"                    % "2.15.0",
  "org.scalatest"        %% "scalatest"                       % "2.2.6"   % Test,
  "org.scalamock"        %% "scalamock-scalatest-support"     % "3.2.2"   % Test
)

enablePlugins(GitVersioning)
git.useGitDescribe := true

bintrayOrganization := Some("samanos")
licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))
