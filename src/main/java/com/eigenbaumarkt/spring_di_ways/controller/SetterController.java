package com.eigenbaumarkt.spring_di_ways.controller;

import com.eigenbaumarkt.spring_di_ways.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterController {

    private MyService myService;

    // (3) - supported, popular way to use Spring DI:
    // use a setter for a private field to inject
    @Autowired
    public void setMyService(MyService myService) {
        this.myService = myService;
    }

    public String saySomething() {
        return myService.getHello();
    }

}
