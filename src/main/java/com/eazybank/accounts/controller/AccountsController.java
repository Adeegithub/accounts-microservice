package com.eazybank.accounts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Rest API calls
public class AccountsController {
    @GetMapping("sayHello") //Support HTTP Get method
    public String sayHello(){
        return "Hi World";
    }
}
