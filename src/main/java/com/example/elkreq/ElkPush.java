package com.example.elkreq;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;

public class ElkPush {
//    private static WebClient webClient;

    public void  pushRequest(){
        String baseUrl = "https://abc.go.com/v1";
        DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(baseUrl);
        WebClient client = WebClient.builder().uriBuilderFactory(factory).build();

    }

    public static void postReq() {
        WebClient webClient = WebClient.create();
//        String baseUrl = "http://dummy.restapiexample.com/api/v1/create";
        String baseUrl = "http://127.0.0.1:9995/post";
        DataEmp dataEmp = new DataEmp()
                .setEmployee_age(25)
                .setEmployee_name("Kel")
                .setEmployee_salary(2000)
                .setId(12)
                .setProfile_image("sdlkndslkndsnkl");

        Employee empl = new Employee()
                .setSuccess("OK")
                .setMessage("I'm OK")
                .setData(dataEmp);

        Employee r = webClient.post()
                .uri(baseUrl)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .body(Mono.just(empl), Employee.class)
                .retrieve()
                .bodyToMono(Employee.class).block();

        System.out.println(r);
    }


}
