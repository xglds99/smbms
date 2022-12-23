package com.ccu.smbms.controller;

import com.ccu.smbms.domain.SmbmsRole;
import com.ccu.smbms.domain.SmbmsUser;
import com.ccu.smbms.service.SmbmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private SmbmsRoleService roleService;

    /**
     * 根据 roleName 搜索角色信息
     * @param roleName
     * @param model
     * @return
     */
    @GetMapping("/search")
    public String search(@RequestParam("roleName") String roleName, Model model) {
        SmbmsRole role = new SmbmsRole();
        role.setRoleName(roleName);
        List<SmbmsRole> roles = roleService.selectSmbmsRoleList(role);
        model.addAttribute("roles", roles);
        return "/role/list";
    }

    /**
     * 获取角色集合
     * @param role
     * @param model
     * @return
     */
    @GetMapping("/list")
    public String list(SmbmsRole role, Model model) {
        List<SmbmsRole> roles = roleService.selectSmbmsRoleList(role);
        model.addAttribute("roles", roles);
        return "/role/list";
    }

    /**
     * 角色信息预览
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/preview")
    public String previewUI(@RequestParam("id") Long id, Model model) {
        SmbmsRole role = roleService.selectSmbmsRoleById(id);
        model.addAttribute("role", role);
        return "/role/preview";
    }

    @GetMapping("/add")
    public String addUI(Model model) {
        model.addAttribute("roles", roleService.selectSmbmsRoleList(new SmbmsRole()));
        return "role/add";
    }

    /**
     * 新增角色
     * @param role
     * @param model
     * @return
     */
    @PostMapping("/add")
    public String add(SmbmsRole role, Model model) {
        int res = roleService.insertSmbmsRole(role);
        model.addAttribute("msg", res == 1 ? true : false);
        return "/role/list";
    }

    /**
     * 根据id删除角色
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id, Model model) {
        model.addAttribute("msg", roleService.deleteSmbmsRoleById(id) == 1 ? true : false);
        return list(new SmbmsRole(), model);
    }

    /**
     * 跳转到更新角色
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/updatePage")
    public String updatePage(@RequestParam("id") Long id, Model model) {
        SmbmsRole role = roleService.selectSmbmsRoleById(id);
        model.addAttribute("role", role);
        return "/role/update";
    }

    /**
     * 保存与修改方法
     * @param role
     * @param session
     * @param model
     * @return
     */
    @PostMapping("/save")
    public String save(SmbmsRole role, HttpSession session, Model model) {
        int rows = 0;
        SmbmsUser loginUser = (SmbmsUser) session.getAttribute("loginUser");

        if (role.getId() != null) {
            // 修改
            role.setModifyBy(loginUser.getId());
            rows = roleService.updateSmbmsRole(role);
        } else {
            // 保存
            role.setCreatedBy(loginUser.getId());
            rows = roleService.insertSmbmsRole(role);
        }
        model.addAttribute("msg", rows == 1 ? true : false);
        return list(new SmbmsRole(), model);
    }



}
