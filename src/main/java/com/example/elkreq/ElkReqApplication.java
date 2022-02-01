package com.example.elkreq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;
import reactor.util.retry.Retry;

import java.time.Duration;
import java.util.Objects;

@SpringBootApplication
public class ElkReqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElkReqApplication.class, args);

        String baseUrl = "http://dummy.restapiexample.com/api/v1/employee/1";
        WebClient client = WebClient.create(baseUrl);
        Employee resp = client.get()
                .retrieve()
                .bodyToMono(Employee.class)
                .retryWhen(Retry.fixedDelay(3, Duration.ofMillis(100)))
                .block();
        System.out.println(Objects.requireNonNull(resp).toString());
    }

}
