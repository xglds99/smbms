package com.ccu.smbms.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(HttpSession session) {
        Object loginUser = session.getAttribute("loginUser");
        if (loginUser != null) {
            return "index";
        }
        return "login";
    }


}
