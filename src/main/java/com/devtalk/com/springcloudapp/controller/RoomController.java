package com.devtalk.com.springcloudapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roomservice")
public class RoomController {

    @GetMapping("/hello")
    public String hello(){
        return "hello from roomService";
    }
}
