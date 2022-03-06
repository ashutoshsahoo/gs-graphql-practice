package com.ashu.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.graphql.web.WebInterceptor;
import reactor.core.publisher.Mono;

import java.time.Duration;

@SpringBootApplication
public class GsGraphqlPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GsGraphqlPracticeApplication.class, args);
    }

    @Bean
    public WebInterceptor interceptor() {
        return (webInput, interceptorChain) -> {
            // Switch threads to prove ThreadLocal context propagation works
            return Mono.delay(Duration.ofMillis(10)).flatMap(aLong -> interceptorChain.next(webInput));
        };
    }
}
