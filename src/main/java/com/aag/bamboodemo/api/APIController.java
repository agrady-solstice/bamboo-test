package com.aag.bamboodemo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {


    @GetMapping(value = "/{phrase}", produces = "application/json")
    public String getResponse(@PathVariable String phrase){

        return "You send a request for " + phrase + ". That's dumb."  ;
    }
}
