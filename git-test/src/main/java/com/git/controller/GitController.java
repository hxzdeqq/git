package com.git.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {
    @GetMapping("/git/test")
    public ResponseEntity<String> test1(){
        return ResponseEntity.ok("test");
    }
}
