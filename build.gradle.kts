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

    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    testCompileOnly("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")

    implementation("org.codehaus.groovy:groovy-all:3.0.20")
}

tasks.test {
    useJUnitPlatform()
}