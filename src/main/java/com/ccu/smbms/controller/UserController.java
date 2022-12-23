package com.ccu.smbms.controller;

import com.ccu.smbms.domain.SmbmsRole;
import com.ccu.smbms.domain.SmbmsUser;
import com.ccu.smbms.service.SmbmsRoleService;
import com.ccu.smbms.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    SmbmsUserService userService;

    @Autowired
    SmbmsRoleService roleService;


    @GetMapping("/search")
    public String search(String userName, Model model) {
        SmbmsUser smbmsUser = new SmbmsUser();
        smbmsUser.setUserName(userName);
        List<SmbmsUser> users = userService.selectSmbmsUserList(smbmsUser);
        model.addAttribute("users", users);
        return "user/list";
    }


    @RequestMapping("/list")
    public String list(SmbmsUser smbmsUser, Model model) {
        List<SmbmsUser> users = userService.selectSmbmsUserList(smbmsUser);
        model.addAttribute("users", users);
        return "user/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id, Model model) {
        model.addAttribute("msg", userService.deleteSmbmsUserById(id) == 1 ? true : false);
        return list(new SmbmsUser(), model);
    }


    @GetMapping("/add")
    public String addUI(Model model) {
        model.addAttribute("roles", roleService.selectSmbmsRoleList(new SmbmsRole()));
        return "user/add";
    }

    @GetMapping("/preview")
    public String previewUI(@RequestParam("id") Long id, Model model) {
        SmbmsUser user = userService.selectSmbmsUserById(id);
        model.addAttribute("user", user);
        return "/user/preview";
    }

    @GetMapping("/update")
    public String updateUI(@RequestParam("id") Long id, Model model) {
        SmbmsUser user = userService.selectSmbmsUserById(id);
        model.addAttribute("user", user);
        model.addAttribute("roles", roleService.selectSmbmsRoleList(new SmbmsRole()));
        return "user/update";
    }

    @PostMapping("/save")
    public String save(SmbmsUser user, HttpSession session, Model model) {
        int rows = 0;
        SmbmsUser loginUser = (SmbmsUser) session.getAttribute("loginUser");

        if (user.getId() != null) {
            user.setModifyBy(loginUser.getId());
            rows = userService.updateSmbmsUser(user);
        } else {
            user.setCreatedBy(loginUser.getId());
            rows = userService.insertSmbmsUser(user);
        }
        model.addAttribute("msg", rows == 1 ? true : false);
        return list(new SmbmsUser(), model);
    }

}
