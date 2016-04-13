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
