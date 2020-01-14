package com.eigenbaumarkt.spring_di_ways.controller.best_practice;

import com.eigenbaumarkt.spring_di_ways.services.best_practice.BpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class BpConstructorController {

    private final BpService bpService;

    public String saySomething() { return bpService.getHello(); }

}
