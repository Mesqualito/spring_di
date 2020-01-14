package com.eigenbaumarkt.spring_di_ways.controller;

import com.eigenbaumarkt.spring_di_ways.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PrivateFieldController {

    // (2) - don't do that:
    // not easy to test, needs Spring context or some reflection utility
    // but Spring supports it
    @Autowired
    private MyService myService;

    public String saySomething() { return myService.getHello(); }

}
