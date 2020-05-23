# Spring boot with GraphQL (GraphQL Playground)

## Getting Started

- Run the application using `gradle bootRun`

- Open `http://localhost:8080` in browser

- Create a vehicle

```graphql
mutation {
  createVehicle(
    type: "car"
    modelCode: "XYZ0192"
    brandName: "XYZ"
    launchDate: "2020-05-21"
  ) {
    id
  }
}
```

- Query vehicles

```graphql
query {
  vehicles(count: 1) {
    id
    type
    modelCode
    brandName
    launchDate
  }
}
```

### Reference Documentation

For further reference, please consider the following sections:

- [GraphQL Spring Boot Starters](https://github.com/graphql-java-kickstart/graphql-spring-boot)
- [GraphQL Java Example for Beginners [Spring Boot]](https://dzone.com/articles/a-beginners-guide-to-graphql-with-spring-boot)
- [Official Gradle documentation](https://docs.gradle.org)
- [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/gradle-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/gradle-plugin/reference/html/#build-image)
- [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)
- [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides

The following guides illustrate how to use some features concretely:

- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Additional Links

These additional references should also help you:

- [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)
