package com.ccu.smbms.controller;

import com.ccu.smbms.domain.SmbmsRole;
import com.ccu.smbms.domain.SmbmsProvider;
import com.ccu.smbms.domain.SmbmsUser;
import com.ccu.smbms.service.SmbmsProviderService;
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
@RequestMapping("/provider")
public class ProviderController {
    
    @Autowired
    private SmbmsProviderService providerService;

    /**
     * 根据供应商名称检索
     * @param proName
     * @param model
     * @return
     */
    @GetMapping("/search")
    public String search(String proName, Model model) {
        SmbmsProvider provider = new SmbmsProvider();
        provider.setProName(proName);
        List<SmbmsProvider> providers = providerService.selectSmbmsProviderList(provider);
        model.addAttribute("providers", providers);
        return "provider/list";
    }


    /**
     * 查询所有供应商信息
     * @param provider
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(SmbmsProvider provider, Model model) {
        List<SmbmsProvider> providers = providerService.selectSmbmsProviderList(provider);
        model.addAttribute("providers", providers);
        return "provider/list";
    }


    /**
     * 根据id删除供应商信息
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id, Model model) {
        model.addAttribute("msg", providerService.deleteSmbmsProviderById(id) == 1 ? true : false);
        return list(new SmbmsProvider(), model);
    }

    /**
     * 添加供应商信息
     *
     * @return
     */
    @GetMapping("/add")
    public String addUI() {
        return "/provider/add";
    }

    @GetMapping("/preview")
    public String previewUI(@RequestParam("id") Long id, Model model) {
        SmbmsProvider provider = providerService.selectSmbmsProviderById(id);
        model.addAttribute("provider", provider);
        return "/provider/preview";
    }

    @GetMapping("/update")
    public String updateUI(@RequestParam("id") Long id, Model model) {
        SmbmsProvider provider = providerService.selectSmbmsProviderById(id);
        model.addAttribute("provider", provider);
        return "provider/update";
    }

    @PostMapping("/save")
    public String save(SmbmsProvider provider, HttpSession session, Model model) {
        int rows = 0;
        SmbmsUser loginUser = (SmbmsUser) session.getAttribute("loginUser");

        if (provider.getId() != null) {
            provider.setModifyBy(loginUser.getId());
            rows = providerService.updateSmbmsProvider(provider);
        } else {
            provider.setCreatedBy(loginUser.getId());
            rows = providerService.insertSmbmsProvider(provider);
        }
        model.addAttribute("msg", rows == 1 ? true : false);
        return list(new SmbmsProvider(), model);
    }
    
    
    
}
