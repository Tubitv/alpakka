resolvers += "Akka library repository".at("https://repo.akka.io/maven")

addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.7")
addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.6.0")
// discipline
addSbtPlugin("de.heikoseeberger" % "sbt-header" % "5.10.0")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")
addSbtPlugin("com.typesafe" % "sbt-mima-plugin" % "1.1.3")
addSbtPlugin("com.lightbend.sbt" % "sbt-java-formatter" % "0.8.0")
// docs
addSbtPlugin("com.lightbend.akka" % "sbt-paradox-akka" % "0.57")
addSbtPlugin("com.lightbend.paradox" % "sbt-paradox-dependencies" % "0.2.4")
addSbtPlugin("com.lightbend.sbt" % "sbt-publish-rsync" % "0.3")
addSbtPlugin("com.github.sbt" % "sbt-unidoc" % "0.5.0")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings" % "3.0.2")
addSbtPlugin("com.github.sbt" % "sbt-site-paradox" % "1.5.0")
// Akka gRPC -- sync with version in Dependencies.scala:22
addSbtPlugin("com.lightbend.akka.grpc" % "sbt-akka-grpc" % "2.4.3")
// templating
addSbtPlugin("com.github.sbt" % "sbt-boilerplate" % "0.7.0")

// sbt plugin for tubi media group scala projects: https://github.com/adRise/sbt-tmg-project
addSbtPlugin("com.tubitv" % "sbt-tmg-project" % "0.8.2")
