Description & Goals
-------------------

Create a project using the generator: http://wildfly-swarm.io/generator/

Explore Wildfly Swarm and various fractions.

Externalise configuration.

Deploy the application in standalone mode (aka uberjar).

Extract the uberjar (JAR/WAR) to understand the structure.

Setup
-----

Install IntelliJ IDEA Lombok plugin.

Import into IntelliJ IDEA as Maven import.

Running
-------

    mvn wildfly-swarm:run

Packaging
---------

To create an uber jar:

    mvn clean package

The jar should be in the target directory with filename [project_name]-swarm.jar


Service
-------

GET http://localhost:8080/api/user/1