val junitVersion: String by rootProject.extra

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:${junitVersion}")
}

tasks {
    test {
        useJUnitPlatform()
    }
}
