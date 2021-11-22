group = "io.bparolini"
version = "0.0.1-SNAPSHOT"

val junitVersion by extra { "5.8.1" }

subprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
        mavenLocal()
    }
}
