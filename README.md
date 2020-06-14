# Singtel-Assesment

Singtel Code assignment for Java developer

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

Your deployment environment should be with
```
Java 8+
Maven
Postman REST client

```

### Installing

Please follow below installation steps


```
1. clone the project into your file directory.
1. Or download Singtel-Assesment-master.zip and unzip in to a file directory
6. Open the terminal and go to the Singtel-Assesment-master root directory
7. Run below set of commands to run the application
		mvn clean install 
		mvn spring-boot:run
8. Open postman rest client and call APIs as mentioned in APIs section 
```


## APIs

Rest API for querying all animals

```
URL: http://localhost:8081/singtel-devtest/api/animals/list
Method: GET
Headers:
	Content-Type:application/json

```


## Running the tests
```
1. Open the terminal and go to the Singtel-Assesment-master root directory
2. Run below commands to run the application
	mvn clean install 
	mvn test
3. Or impoprt the project into eclipse as a maven project
4. Right click on the src/test/java folder
5. Click Run As --> JUnit Test.
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Java](https://www.oracle.com/sg/java/technologies/javase-downloads.html) - Used programming language
* [Maven](https://maven.apache.org/) - Dependency Managementt
* [Spring Boot](http://start.spring.io/) - Used bakend framework



## Versioning

* **Version 1.0**


## Authors

* **Dinesh Madushanka**



## License



## Acknowledgments

