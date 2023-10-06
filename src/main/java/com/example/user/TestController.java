package com.example.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @PostMapping
    public void post() {
        System.out.println("post");

    }

    @GetMapping
    public void get() {
        System.out.println("get");

    }

    @PatchMapping
    public void patch() {
        System.out.println("patch");

    }

    @DeleteMapping
    public void delete() {
        System.out.println("delete");


    }
}
