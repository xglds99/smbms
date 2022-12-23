package com.ccu.smbms.controller;

import com.ccu.smbms.domain.SmbmsUser;
import com.ccu.smbms.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AuthController {

    @Autowired
    private SmbmsUserService userService;


    @PostMapping("/login")
    public String login(SmbmsUser user, HttpSession session, Model model) {
        SmbmsUser loginUser = null;
        loginUser = (SmbmsUser) session.getAttribute("loginUser");
        if (loginUser != null) {
            return "index";
        }
        System.out.println(user);
        List<SmbmsUser> users = userService.selectSmbmsUserList(user);

        if(users != null && users.size() != 0) {
            loginUser = users.get(0);
            session.setAttribute("loginUser", loginUser);
            model.addAttribute("loginUser", loginUser);
            return "index";
        }
        model.addAttribute("error", "账号或密码错误!");
        return "login";
    }


    @GetMapping("/logout")
    public String logout(HttpSession session) {
        if(session.getAttribute("loginUser") != null) {
            session.setAttribute("loginUser", null);
        }
        return "login";
    }

}
