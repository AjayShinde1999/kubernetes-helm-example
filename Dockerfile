FROM openjdk:8

ADD target/kubernetes-helm-example.jar kubernetes-helm-example.jar

ENTRYPOINT ["java","-jar","kubernetes-helm-example.jar"]