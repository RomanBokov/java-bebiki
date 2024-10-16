plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.rest-assured:rest-assured:4.5.1")
    testImplementation("com.github.javafaker:javafaker:1.0.2")
    testImplementation( "com.fasterxml.jackson.core:jackson-databind:2.10.2")
    testImplementation("com.google.code.gson:gson:2.8.8")
    testImplementation("com.fasterxml.jackson.core:jackson-databind:2.13.0")
    compileOnly("org.projectlombok:lombok:1.18.32")
    annotationProcessor("org.projectlombok:lombok:1.18.32")
    testCompileOnly("org.projectlombok:lombok:1.18.32")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.32")

}

tasks.test {
    useJUnitPlatform()
}