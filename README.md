spring-ex09-security
======================

This example builds on spring-ex08-security, where we added simple Spring Security with credentials contained in a cofiguration file.  In this example, we convert the configuration file based authentication to database driven authentication.  We create a simple users table and access it for security by using Spring Security's UserDetailsService.

This example has been validated with the following environment on MS Windows 7:

1. Eclipse Kepler
   1.1 Spring Tool Suite (STS) 3.4.0.RELEASE - for Kepler
2. Java SDK 1.7.0_51 (separate install)
3. Tomcat 7.0.50 (separate install)
4. Maven 3.0.5 (separate install)
5. MySQL 5.5.29
