import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    val kotlinVersion = "1.8.21"

    id("org.springframework.boot") version "2.7.14"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.spring") version kotlinVersion
}

group = "by.dm13y.examples"
version = "0.1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

val mapstructVersion = "1.5.5.Final"
val apacheCommonVersion = "3.13.0"

dependencies {
    implementation("org.mapstruct:mapstruct:$mapstructVersion")
    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")

    implementation("org.apache.commons:commons-lang3:$apacheCommonVersion")

    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
