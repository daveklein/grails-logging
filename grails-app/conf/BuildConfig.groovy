grails.project.class.dir = "target/classes"
grails.project.target.level = 1.7
grails.project.source.level = 1.7
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.dependency.resolution = {
  // inherit Grails' default dependencies
  inherits("global") {
    // uncomment to disable ehcache
    // excludes 'ehcache'
  }
  log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
  repositories {
    mavenLocal()
    grailsCentral()
  }
  dependencies {
    // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

    // runtime 'mysql:mysql-connector-java:5.1.18'
  }

  plugins {
    build(":tomcat:7.0.54",
          ":release:2.2.1") {
        export = false
    }
    compile ':plugin-config:0.2.0'
  }
}
