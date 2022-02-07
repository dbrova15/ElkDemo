package com.example.elkreq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class ElkReqApplication {

    private static final WebClient webClient = WebClient.create();


    public static void main(String[] args) {
        SpringApplication.run(ElkReqApplication.class, args);

//        String baseUrl = "http://dummy.restapiexample.com/api/v1/employee/1";
//
//        RequestClazz request = new RequestClazz();
//        RequestClazz.get(baseUrl, Employee.class);
        ElkPush.postReq();
    }

}
