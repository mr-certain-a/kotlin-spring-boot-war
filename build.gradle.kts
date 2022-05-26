buildscript {
	extra["kotlinVersion"] = "1.6.21"
	extra["springBootVersion"] = "2.7.0"

	repositories {
		mavenCentral()
	}

	dependencies {
		classpath("org.springframework.boot:spring-boot-gradle-plugin:${property("springBootVersion")}")
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${property("kotlinVersion")}")
		classpath("org.jetbrains.kotlin:kotlin-allopen:${property("kotlinVersion")}")
	}
}

plugins {
	kotlin("jvm") version "${property("kotlinVersion")}"
	id("org.jetbrains.kotlin.plugin.spring") version "${property("kotlinVersion")}"
	`eclipse-wtp`
	id("org.springframework.boot") version "${property("springBootVersion")}"
	war
}

group = "org.calaedo"
version = "0.0.1-SNAPSHOT"

repositories {
	mavenCentral()
}

configurations {
	//providedRuntime
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf:${property("springBootVersion")}")
	implementation("org.springframework.boot:spring-boot-starter-web:${property("springBootVersion")}")
	implementation("org.jetbrains.kotlin:kotlin-reflect:${property("kotlinVersion")}")
	//providedRuntime('org.springframework.boot:spring-boot-starter-tomcat')
	testImplementation("org.springframework.boot:spring-boot-starter-test:${property("springBootVersion")}")
}
