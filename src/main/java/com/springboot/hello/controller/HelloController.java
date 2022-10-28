package com.springboot.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/get-api")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello World";
    }

    @GetMapping(value = "/name")
    public String getName() {
        return "jinseon";
    }

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable(@PathVariable String variable) {
        return variable;
    }

    @GetMapping(value = "/variable1/{variable}")
    public String getVariable2(@PathVariable("variable") String variable) {
        return variable;
    }
}
