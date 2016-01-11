import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.plugin.kotlin.*
import com.beust.kobalt.plugin.java.*

val repos = repos()

val j = javaProject {
    name = "classgraph-java"

    dependenciesTest {
        compile("org.testng:testng:6.9.5")
    }
}

val k = kotlinProject (j) {
    name = "classgraph"
    group = "com.guatec.kobalt"
    artifactId = name
    version = "0.1"
    buildDirectory = "kotlinBuild"

    sourceDirectories {
        path("src/main/kotlin")
        path("src/main/resources")
    }

    sourceDirectoriesTest {
        path("src/test/resources")
        path("src/test/kotlin")
    }

    dependencies {
        compile("com.beust:kobalt:0.390")
    }

    dependenciesTest {
        compile("org.testng:testng:6.9.5")
    }

    assemble {
        jar {
        }
    }
}
