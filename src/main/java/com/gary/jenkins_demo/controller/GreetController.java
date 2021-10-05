package com.gary.jenkins_demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetController {

    @ResponseBody
    @GetMapping(value = "/greet/hello")
    public String greetResponse() {
        return "Hello!! This is Jenkins Demo. Today is a good day. We are sinoPac.";
    }

}
