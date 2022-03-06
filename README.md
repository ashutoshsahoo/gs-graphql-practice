# Spring Boot with GraphQL (GraphQL Playground)

## Getting Started

### Run application

- Run the application using `gradle bootRun`

- Open `http://localhost:8080/graphiql` in browser

### Test Application

- Query Employee

```graphql
{
    employees {
        id
        name
        salary
    }
}
```

and inside REQUEST HEADERS

```json
{
  "Authorization": "Basic YWRtaW46YWRtaW4="
}
```

Response :

```json
{
  "data": {
    "employees": [
      {
        "id": "1",
        "name": "Andi",
        "salary": "42"
      }
    ]
  }
}
```

### Run application inside docker

```shell
gradle build
gradle jibDockerBuild
docker run -d -p 8080:8080 ashutoshsahoo/gs-graphql
docker ps
docker stop <container-id> 
docker rm <container-id>
```

### Reference Documentation

For further reference, please consider the following sections:

* [Spring-GraphQL](https://docs.spring.io/spring-graphql/docs/1.0.0-M5/reference/html/)
* [Spring-GraphQL-Github](https://github.com/spring-projects/spring-graphql)
* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.0-M2/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.0-M2/gradle-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Security](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#boot-features-security)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.6.4/reference/htmlsingle/#production-ready)
* [jib-gradle-plugin](https://github.com/GoogleContainerTools/jib/tree/master/jib-gradle-plugin)

### Guides

The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
