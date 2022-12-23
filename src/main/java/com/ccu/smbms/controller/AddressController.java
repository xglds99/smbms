package com.ccu.smbms.controller;


import com.ccu.smbms.domain.SmbmsAddress;
import com.ccu.smbms.domain.SmbmsUser;
import com.ccu.smbms.service.SmbmsAddressService;
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
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private SmbmsAddressService addressService;


    /**
     * 根据联系人姓名搜索
     * @param contact
     * @param model
     * @return
     */
    @GetMapping("/search")
    public String search(String contact, Model model) {
        SmbmsAddress smbmsAddress = new SmbmsAddress();
        smbmsAddress.setContact(contact);
        List<SmbmsAddress> addresses = addressService.selectSmbmsAddressList(smbmsAddress);
        model.addAttribute("addresses", addresses);
        return "address/list";
    }


    /**
     * 查询所有地址信息
     * @return
     */
    @GetMapping("/list")
    public String list(SmbmsAddress address, Model model) {
        List<SmbmsAddress> addressList = addressService.selectSmbmsAddressList(address);
        model.addAttribute("addresses", addressList);
        return "/address/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id, Model model) {
        model.addAttribute("msg", addressService.deleteAddressById(id) == 1 ? true : false);
        return list(new SmbmsAddress(), model);
    }


    @GetMapping("/add")
    public String addUI(Model model) {
        return "address/add";
    }

    @GetMapping("/preview")
    public String previewUI(@RequestParam("id") Long id, Model model) {
        SmbmsAddress address = addressService.selectAddressById(id);
        model.addAttribute("address", address);
        return "/address/preview";
    }

    @GetMapping("/update")
    public String updateUI(@RequestParam("id") Long id, Model model) {
        SmbmsAddress address = addressService.selectAddressById(id);
        model.addAttribute("address", address);
        return "address/update";
    }

    @PostMapping("/save")
    public String save(SmbmsAddress address, HttpSession session, Model model) {
        int rows = 0;
        SmbmsUser loginUser = (SmbmsUser) session.getAttribute("loginUser");

        if (address.getId() != null) {
            address.setModifyBy(loginUser.getId());
            rows = addressService.updateSmbmsAddress(address);
        } else {
            address.setUserId(loginUser.getId());
            address.setCreatedBy(loginUser.getId());
            rows = addressService.insertSmbmsAddress(address);
        }
        model.addAttribute("msg", rows == 1 ? true : false);
        return list(new SmbmsAddress(), model);
    }

}
