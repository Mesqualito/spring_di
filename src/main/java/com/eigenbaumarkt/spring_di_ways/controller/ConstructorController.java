package com.eigenbaumarkt.spring_di_ways.controller;

import com.eigenbaumarkt.spring_di_ways.services.MyService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorController {

    private MyService myService;

    // (4) - on our way to best practice using Spring DI:
    // inject the service to the class with its constructor
    public ConstructorController(MyService myService) {
        this.myService = myService;
    }

    public String saySomething() { return myService.getHello(); }

}
