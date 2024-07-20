package com.akash.mediafox.foxy.network;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSpringController {

    @RequestMapping
    public String hello(){
        return "Hello World";
    }
}
