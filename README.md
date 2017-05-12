Description & Goals
-------------------

1. Create a project using the generator: http://wildfly-swarm.io/generator/
2. Explore Wildfly Swarm and various fractions.
3. Externalise configuration.
4. Deploy the application in standalone mode (aka uberjar).
5. Extract the uberjar (JAR/WAR) to understand the structure.

Setup
-----

- Install IntelliJ IDEA Lombok plugin.
- Import into IntelliJ IDEA as Maven import.

Run
---
```
mvn wildfly-swarm:run
```
Package
-------

To create an uber jar:
```
mvn clean package
```
The jar should be in the target directory with filename [project_name]-swarm.jar

Use
---

GET http://localhost:8080/api/user/1
