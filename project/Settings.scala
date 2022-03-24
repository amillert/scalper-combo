import sbt.Keys.{ organization, scalaVersion }
import sbt.Project

import org.scalafmt.sbt.ScalafmtPlugin

object Settings {
  private final val version   = "0.0.1"
  private final val org       = "amillert"
  private final val scVersion = "3.1.1"

  implicit final class ProjectFrom(project: Project) {

    def minimalSettings = project
      .settings(organization := org, scalaVersion := scVersion)

    def commonSettings   = project.minimalSettings.scalafmtSettings
    def scalafmtSettings = project.enablePlugins(ScalafmtPlugin)
  }

}
