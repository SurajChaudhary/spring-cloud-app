package com.devtalk.com.springcloudapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/roomservice")
public class RoomController {

    @GetMapping("/hello")
    public String hello() {
        return "hello from roomService";
    }

    @GetMapping("/rooms")
    public List<String> rooms() {
        return Arrays.asList(new String[]{"room1", "room2", "room3"});
    }
}
