# NES Struts 2.5.33 Trial

This repository provides a trial setup for the Never-Ending Support (NES) version of Struts 2.5.33. The example apps are from OSS struts 2.5.33 example apps and have been updated to use NES trial products. This project contains both maven and gradle examples. It demonstrates how to use NES as a drop in replacement.

## Getting Started - Trial Setup & Build Instructions

1. Configure your local environment to use the HeroDevs NES registry.
    1. ~/.m2/settings.xml
    ```xml
    <settings>
      <servers>
        <!-- Other server settings -->
        <server>
          <id>herodevs-nes-registry</id>
          <username>some@email.com</username>
          <password>some@email.com</password>
        </server>
      </servers>
    </settings>
    ```
    2. ~/.gradle/gradle.properties
    ```properties
   herodevs_nes_registry_url=https://registry.nes.herodevs.com/maven
   herodevs_nes_registry_user=some@email.com
   herodevs_nes_registry_token=some@email.com
    ```
2. Build the project. Gradle requires java 11 and maven requires java 8.
   1. Navigate to the build directory. `cd maven` or `cd gradle`.
   2. For Maven: Run `./mvnw clean install`.
   3. For Gradle: Run `./gradlew clean build`.

## Verification
To verify that the NES products are being used, check the following:
For Maven run `./mvnw dependency:tree` and look for `struts2-2.5.35-trial` in the output. Example output:
```
\- org.apache.struts:struts2-core:jar:2.5.33-struts2-2.5.35-trial:compile
```

For Gradle run `./gradlew dependencies` and look for `struts2-2.5.35-trial` in the output. Example output:
```
+--- org.apache.struts:struts2-config-browser-plugin:2.5.33-struts2-2.5.35-trial
|    \--- org.apache.struts:struts2-core:2.5.33-struts2-2.5.35-trial (*)
```

# Running the Sample Application
To run the sample application, follow these steps:
1. build the Docker image `docker build . -t nes-struts2-apps`
2. Run the Docker container `docker run --rm -p 8080:8080 nes-struts2-apps`
3. Open the browser and navigate to `http://localhost:8080/`