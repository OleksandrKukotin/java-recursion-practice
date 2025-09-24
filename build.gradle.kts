plugins {
    application
}

repositories {
    mavenCentral()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

sourceSets {
    named("main") {
        java.setSrcDirs(listOf("src"))
        resources.setSrcDirs(emptyList<String>())
    }
    named("test") {
        java.setSrcDirs(listOf("test"))
        resources.setSrcDirs(emptyList<String>())
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

tasks.test {
    useJUnitPlatform()
}

application {
    // Main class is in the default package
    mainClass.set("MainApplication")
}

tasks.jar {
    manifest {
        attributes(
            mapOf(
                "Main-Class" to "MainApplication"
            )
        )
    }
}

