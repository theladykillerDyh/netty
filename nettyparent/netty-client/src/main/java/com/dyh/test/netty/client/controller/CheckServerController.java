package com.dyh.test.netty.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckServerController {
    @GetMapping("/checkServer")
    @ResponseBody
    public String checkServer() {
        return "ok";
    }
}
