import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.assemble
import com.beust.kobalt.plugin.kotlin.*

val repos = repos()


val p = kotlinProject {

    name = "classgraph"
    group = "com.guatec.kobalt"
    artifactId = name
    version = "0.1"

    sourceDirectories {
        path("src/main/kotlin")
        path("src/main/resources")
        path("src/main/res")
    }

    sourceDirectoriesTest {
        path("src/test/resources")
        path("src/test/res")
        path("src/test/kotlin")
    }

    dependencies {
        compile("com.beust:kobalt:0.390")
    }

    dependenciesTest {
//        compile("org.testng:testng:6.9.5")

    }

    assemble {
        jar {
        }
    }
}
