apply(plugin = "war")

dependencies {
    implementation("org.apache.struts:struts2-config-browser-plugin:2.5.33")
    implementation("org.apache.struts:struts2-sitemesh-plugin:2.5.33")
    implementation("org.apache.struts:struts2-tiles-plugin:2.5.33")
    implementation("org.apache.struts:struts2-dwr-plugin:2.5.33")
    implementation("org.apache.struts:struts2-json-plugin:2.5.33")
    implementation("org.apache.tiles:tiles-jsp:3.0.8")
    implementation("org.apache.struts:struts2-convention-plugin:2.5.33")
    implementation("org.apache.struts:struts2-spring-plugin:2.5.33")
    implementation("org.apache.struts:struts2-bean-validation-plugin:2.5.33")
    implementation("org.apache.logging.log4j:log4j-api:2.12.4")
    implementation("org.apache.logging.log4j:log4j-core:2.12.4")
    implementation("org.apache.logging.log4j:log4j-jcl:2.12.4")
    implementation("org.apache.velocity:velocity:1.7")
    implementation("org.apache.velocity:velocity-tools:2.0")
    implementation("opensymphony:sitemesh:2.4.2")
    implementation("uk.ltd.getahead:dwr:1.1.1")
    implementation("commons-fileupload:commons-fileupload:1.4")
    implementation("org.hibernate:hibernate-validator:5.4.3.Final")
    compileOnly("javax.servlet:javax.servlet-api:3.1.0")

    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.10.2")
    testImplementation("junit:junit:4.12")
    testImplementation("net.sourceforge.jwebunit:jwebunit-core:1.4.1")
    testImplementation("net.sourceforge.jwebunit:jwebunit-htmlunit-plugin:1.4.1") {
        exclude(group = "xom", module = "xom")
    }
    testImplementation("commons-httpclient:commons-httpclient:3.1")
    testImplementation("javax.servlet:javax.servlet-api:3.1.0") {
        isTransitive = false // Avoid pulling in the entire servlet API
    }
}