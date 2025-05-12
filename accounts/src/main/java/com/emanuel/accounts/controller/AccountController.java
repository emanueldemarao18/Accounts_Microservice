package com.emanuel.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("Sayhello")
    public String SayHello() {
        return "Hello World";
    }


}
