# Kafka Example
## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
This project is simple Spring Boot application with Kafka producer and consumer.
Also this project contains external services for monitoring.

## Technologies
Project is created with:
* Spring Boot
* Docker  
* Kafka, Zookeeper, Kafdrop
* Prometheus, Graphana

## Setup
To run this project first of all run

```
$ docker-compose up
```

after that run application and send messages with:

```
POST -> localhost:8090/publish?message=HelloWorld
```