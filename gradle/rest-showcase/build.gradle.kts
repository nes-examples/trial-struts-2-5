apply(plugin = "war")

dependencies {
    implementation("org.apache.struts:struts2-rest-plugin:2.5.33")
    implementation("org.apache.struts:struts2-convention-plugin:2.5.33")
    implementation("org.apache.struts:struts2-config-browser-plugin:2.5.33")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.10.5")
    implementation("org.apache.logging.log4j:log4j-api:2.12.4")
    implementation("org.apache.logging.log4j:log4j-core:2.12.4")

    testRuntimeOnly("org.junit.vintage:junit-vintage-engine:5.10.2")
    testImplementation("junit:junit:4.12")
    testImplementation("net.sourceforge.jwebunit:jwebunit-core:1.4.1")
    testImplementation("net.sourceforge.jwebunit:jwebunit-htmlunit-plugin:1.4.1") {
        exclude(group = "xom", module = "xom")
    }
    testImplementation("commons-httpclient:commons-httpclient:3.1")
}