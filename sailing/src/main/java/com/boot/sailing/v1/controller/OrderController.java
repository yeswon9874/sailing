package com.boot.sailing.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderController {

    @RequestMapping("/v1/order")
    public String doOrder() {
        return "/v1/order/order";
    }
}
