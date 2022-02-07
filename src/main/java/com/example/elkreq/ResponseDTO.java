package com.example.elkreq;

import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseDTO {
    public static ResponseEntity<Object> ok(Object obj) {
        Map<String,Object> response = new HashMap<String, Object>();
        response.put("ok", obj);
        return ResponseEntity.ok().body(response);
    }

    public static ResponseEntity<Object> fail(Object obj) {
        Map<String,Object> response = new HashMap<String, Object>();
        response.put("ok", obj);
        return ResponseEntity.accepted().body(response);
    }

    public static ResponseEntity<Object> response(String status, Object obj) {
        Map<String,Object> response = new HashMap<String, Object>();
        response.put(status, obj);
        return ResponseEntity.accepted().body(response);
    }

    public static ResponseEntity<Object> ok() {
        return ResponseEntity.ok().build();
    }

    public static ResponseEntity<Object> fail() {
        return ResponseEntity.ok().build();
    }

}