plugins {
    id("java")
    id("war")
}

group = "com.github.appseed246"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    providedCompile("jakarta.servlet:jakarta.servlet-api:5.0.0")
}

tasks.test {
    useJUnitPlatform()
}