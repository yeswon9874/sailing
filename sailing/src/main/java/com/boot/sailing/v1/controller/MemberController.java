package com.boot.sailing.v1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    @RequestMapping("/v1/member")
    public String doMember() {
        return "/v1/member/member";
    }
}
