package com.eigenbaumarkt.spring_di_ways.services.best_practice;

import org.springframework.stereotype.Service;

@Service
public class BpServiceImpl implements BpService {

    @Override
    public String getHello() { return "The Best Hello!"; }
}
