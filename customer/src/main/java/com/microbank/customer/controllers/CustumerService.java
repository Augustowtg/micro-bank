package com.microbank.customer.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping ("/customer")
public class CustumerService {

    @GetMapping()
    public List<String> find() {
        return List.of("Test 1 ", "Test 2");
    }

}
