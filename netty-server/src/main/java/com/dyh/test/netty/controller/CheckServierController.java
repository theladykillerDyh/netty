package com.dyh.test.netty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/checkServer")
public class CheckServierController {
    @GetMapping("/start")
    @ResponseBody
    public String start() {
        return "ok";
    }
}
