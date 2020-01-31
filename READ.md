# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.cham.quartz-cluster' is invalid and this project uses 'com.cham.quartzcluster' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/maven-plugin/)

Install mysql

create a database called quartz_demo

execute the Quartz table creation scripts given in /resources/quartz_tables.sql

replace the below 2 properties in /resources/application.properties with your local MySql details.

spring.datasource.username =<< your user name >>
spring.datasource.password =<< your password >>
