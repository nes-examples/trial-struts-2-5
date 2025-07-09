plugins {
    id("org.gretty") version "3.0.6"
}

group = "org.apache.struts"
version = "nes-v2.5.35-trial"

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
        maven {
            url = uri(providers.gradleProperty("herodevs_nes_registry_url").forUseAtConfigurationTime().get())
            credentials {
                username = providers.gradleProperty("herodevs_nes_registry_user").forUseAtConfigurationTime().get()
                password = providers.gradleProperty("herodevs_nes_registry_token").forUseAtConfigurationTime().get()
            }
        }
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