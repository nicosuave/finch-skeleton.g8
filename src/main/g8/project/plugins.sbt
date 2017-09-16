resolvers ++= Seq(
    Classpaths.typesafeReleases,
    Classpaths.sbtPluginReleases,
    "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
  )

addSbtPlugin("io.get-coursier"        % "sbt-coursier"           % "1.0.0-RC11")
addSbtPlugin("org.scoverage"          % "sbt-scoverage"          % "1.5.1")
addSbtPlugin("com.typesafe.sbt"       % "sbt-native-packager"    % "1.2.0")
addSbtPlugin("com.timushev.sbt"       % "sbt-updates"            % "0.3.1")
addSbtPlugin("io.spray"               % "sbt-revolver"           % "0.9.0")
addSbtPlugin("org.scalastyle"         %% "scalastyle-sbt-plugin" % "1.0.0")
