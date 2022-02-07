package com.example.elkreq;

import org.springframework.web.reactive.function.client.WebClient;

public class RequestClazz {

    static WebClient webClient;

    public static void get(String url, Class<?> clazz) {

//        return webClient.get().uri(url)
//                .retrieve()
//                .bodyToMono(clazz.class)
//                .block();
//
    }

    private static void post() {

    }
}
