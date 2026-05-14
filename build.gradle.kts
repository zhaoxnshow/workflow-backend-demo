plugins {
    java
    id("org.springframework.boot") version "3.5.14"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

repositories {
    mavenCentral()
}

dependencies {
    // Spring Boot Starters
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-actuator")

    // Spring Security + OAuth2 Client (Azure AD)
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-client")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")

    // MyBatis Plus
    implementation("com.baomidou:mybatis-plus-spring-boot3-starter:3.5.16")
    implementation("com.baomidou:mybatis-plus-jsqlparser:3.5.16")

    // PostgreSQL
    runtimeOnly("org.postgresql:postgresql")

    // Flowable Workflow Engine
    implementation("org.flowable:flowable-spring-boot-starter:7.2.0")

    // Microsoft Graph SDK (Office365 Email)
    implementation("com.microsoft.graph:microsoft-graph:6.5.0")
    implementation("com.azure:azure-identity:1.12.0")

    // Swagger / OpenAPI
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.8.17")

    // Lombok
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")

    // Test
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
