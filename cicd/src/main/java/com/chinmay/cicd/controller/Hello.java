package com.chinmay.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Hello {

    @GetMapping("hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("hello world");

    }

    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String("testing webhook push");
    }
    
    @GetMapping("2")
    public String getMethodName2(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("path3")
    public String getMethodName3(@RequestParam String param) {
        return new String();
    }
    


}
