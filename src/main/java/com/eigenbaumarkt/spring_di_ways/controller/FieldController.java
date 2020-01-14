package com.eigenbaumarkt.spring_di_ways.controller;

import com.eigenbaumarkt.spring_di_ways.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FieldController {

    // (1) - don't do that: direct Field injection is not recommended
    // injecting a service directly into a property, no getter/setter-setup, field not marked as private
    @Autowired
    MyService myService;

    public String saySomething() { return myService.getHello(); }

}
