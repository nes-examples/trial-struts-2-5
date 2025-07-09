plugins {
    id("org.gretty") version "3.0.6"
}

group = "org.apache.struts"
version = "v2.5.33-apps"

repositories {
    jcenter()
    mavenCentral()
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "war")

    plugins.apply("org.gretty")

    gretty {
        servletContainer = "jetty9.4"
        integrationTestTask = "test"
    }

    repositories {
        mavenCentral()
    }

    tasks.withType<JavaCompile>().configureEach {
        sourceCompatibility = JavaVersion.VERSION_1_8.toString()
        targetCompatibility = JavaVersion.VERSION_1_8.toString()
        options.compilerArgs.addAll(
            listOf(
                "-Xlint:all",
                "-Xlint:-processing",
                "-Xlint:-serial",
                "-parameters"
            )
        )
    }

}