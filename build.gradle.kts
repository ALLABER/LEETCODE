plugins {
    kotlin("jvm") version "1.9.23"
}

group = "com.allaber"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}