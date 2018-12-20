package com.discorp.supportportal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RatesController {
    @Value("${rate}")
    String rate;
    @Value("${lanecount}")
    String lanecount;
    @Value("${tollstart}")
    String tollstart;
    @GetMapping("/")
    public String getRate(){
        return "Rate: "+ rate + " LaneCount: " + lanecount + " TotalStart " + tollstart;
    }
}
