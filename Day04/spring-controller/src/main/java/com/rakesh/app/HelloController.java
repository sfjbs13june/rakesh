package com.rakesh.app;

import org.springframework.web.bind.annotation.*;


@RestController
public class HelloController{
    @GetMapping("/hello")
    public String SayHello(){
        return "hello from App";
    }
    @RequestMapping("/request/hello")
    public String requestHello(){
        return "hello from request mapping";
    }
    @GetMapping("/welcome")
    public String hello(@RequestParam("name") String name){
        return "welcome to "+name;
    }
    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable String message){return  "send message "+message;}

}
