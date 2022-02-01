package com.example.elkreq;

import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.DefaultUriBuilderFactory;

public class ElkPush {
    public void  pushRequest(){
        String baseUrl = "https://abc.go.com/v1";
        DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(baseUrl);
        WebClient client = WebClient.builder().uriBuilderFactory(factory).build();

    }


}
