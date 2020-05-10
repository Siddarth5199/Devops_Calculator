FROM openjdk:8-alpine
COPY /target/devops_spe-1.0-SNAPSHOT.jar /home/devops_spe-1.0-SNAPSHOT.jar
CMD ["java","-cp","/home/devops_spe-1.0-SNAPSHOT.jar","calc.Calculator_devops"]
