plugins {
    id("java")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.2")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Other dependencies
    implementation("org.json:json:20210307")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}