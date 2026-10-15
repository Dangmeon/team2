package com.team2.popup_reservation.waiting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/waiting")
public class WaitingController {

    @GetMapping("/test")
    public String test() {
        System.out.println("테스트");
        return "test";
    }
}