package com.dyh.test.netty.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class checkServerController {
    @GetMapping("/checkServer")
    @ResponseBody
    public String checkServer() {
        return "netty server is ok";
    }
}
