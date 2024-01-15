# Spring Boot Quick Start

Spring is an enterprise Java framework that is used to develop enterprise Java applications.

Spring Boot is based on the Spring Framework. It basically provides a way in to bootstrap or have an easy to start Spring application.

## Spring

- Spring is an `application framework` used to build enterprise Java applications
  - some common applications include building RESTful APIs, services, micro-services, etc
- Spring also has a `programming and configuration model`
  - define services as classes with annotations and Spring automatically adds the required functionalities corresponding to the annotation
- Spring also provides `infrastructure support`
  - connect to relational/non-relational databases
  - handle HTTP calls
- Spring uses MVC for a web application

### Problems with Spring

- Huge framework
- Multiple setup and configuration steps
- Multiple build and deploy steps

## Spring Boot

- Spring refers to the Java Spring framework
- Boot refers to the ability of Spring Boot to bootstrap a Spring application
- Spring Boot makes it easy to create stand-alone, production-grade Spring based applications that can be **just run**

### How does Spring Boot address the problems with Spring?

- Spring Boot is opinionated
  - provides a default set of configuration as a starting point
  - the configurations are still customizable, however they work for most of the cases
- Spring Boot prefers convention over configuration
- Spring Boot applications are stand alone, ready to run
- Spring Boot applications are production-ready

### Starting Spring Boot

- Sets up default configuration
- Starts Spring application context
- Performs class path scan
- Starts Tomcat server

## Embedded Tomcat Server

Spring Boot deployable contains an embedded Tomcat server which

- provides convenience
- now does servlet container config through application config
- makes the application stand alone
- makes this useful for microservices architecture

## Controller

- a simple Java class
- functions to map request to responses
- marked with annotations
- has info about
  - what URL access triggers it?
  - what method to run when accessed?
    - `@GETMapping` maps a function to GET requests

## Spring MVC

- allows build Controllers that map requests to responses
- automatically converts values returned from controller methods into valid JSON
