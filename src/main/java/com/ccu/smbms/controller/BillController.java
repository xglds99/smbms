package com.ccu.smbms.controller;

import com.ccu.smbms.domain.SmbmsBill;
import com.ccu.smbms.domain.SmbmsBill;
import com.ccu.smbms.domain.SmbmsProvider;
import com.ccu.smbms.domain.SmbmsUser;
import com.ccu.smbms.service.SmbmsBillService;
import com.ccu.smbms.service.SmbmsProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/bill")
public class BillController {
    
    @Autowired
    private SmbmsBillService billService;

    @Autowired
    private SmbmsProviderService providerService;


    /**
     * 根据商品名称搜索
     * @param productName
     * @param model
     * @return
     */
    @GetMapping("/search")
    public String search(String productName, Model model) {
        SmbmsBill bill = new SmbmsBill();
        bill.setProductName(productName);
//        List<SmbmsBill> bills = billService.selectSmbmsBillList(bill);
//        model.addAttribute("bills", bills);
//        return "bill/list";
        return list(bill, model);
    }


    /**
     * 查询所有订单信息
     * @return
     */
    @GetMapping("/list")
    public String list(SmbmsBill bill, Model model) {
        List<SmbmsBill> list = billService.selectSmbmsBillList(bill);
        List<SmbmsBill> bills = list.stream().filter(e -> e != null).collect(Collectors.toList());
        model.addAttribute("bills", bills);
        return "/bill/list";
    }


    /**
     * 通过id删除
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id, Model model) {
        model.addAttribute("msg", billService.deleteSmbmsBillById(id) == 1 ? true : false);
        return list(new SmbmsBill(), model);
    }


    /**
     * 添加订单信息
     * @param model
     * @return
     */
    @GetMapping("/add")
    public String addUI(Model model) {
        List<SmbmsProvider> providers = providerService.selectSmbmsProviderList(new SmbmsProvider());
        model.addAttribute("providers", providers);
        return "bill/add";
    }

    /**
     * 订单信息预览
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/preview")
    public String previewUI(@RequestParam("id") Long id, Model model) {
        SmbmsBill bill = billService.selectSmbmsBillById(id);
        SmbmsProvider provider = providerService.selectSmbmsProviderById(bill.getProviderId().longValue());
        bill.setProviderId(provider.getId().intValue());
        model.addAttribute("bill", bill);
        return "/bill/preview";
    }

    /**
     * 订单信息预览
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/update")
    public String updateUI(@RequestParam("id") Long id, Model model) {
        SmbmsBill bill = billService.selectSmbmsBillById(id);
        List<SmbmsProvider> providers = providerService.selectSmbmsProviderList(new SmbmsProvider());
        model.addAttribute("providers", providers);
        model.addAttribute("bill", bill);
        return "bill/update";
    }

    /**
     * 保存/更新订单信息
     * @param bill
     * @param session
     * @param model
     * @return
     */
    @PostMapping("/save")
    public String save(SmbmsBill bill, HttpSession session, Model model) {
        int rows = 0;
        SmbmsUser loginUser = (SmbmsUser) session.getAttribute("loginUser");

        if (bill.getId() != null) {
            // 更新订单

            bill.setModifyBy(loginUser.getId());
            rows = billService.updateSmbmsBill(bill);
        } else {
            // 保存
            Long id = billService.getLatestId();
            // 设置订单编号
            bill.setBillCode(generateBillCode(id));

            bill.setIsPayment(1);
            bill.setCreatedBy(loginUser.getId());
            rows = billService.insertSmbmsBill(bill);
        }
        model.addAttribute("msg", rows == 1 ? true : false);
        return list(new SmbmsBill(), model);
    }


    /**
     * 生成订单代码
     * @param id
     * @return
     */
    private String generateBillCode(Long id) {
        DecimalFormat decimalFormat = new DecimalFormat("000");
        String formatId = decimalFormat.format(id + 1);
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String timeStamp = simpleDateFormat.format(date);
        return "BILL" + timeStamp + "_" +  formatId;
    }

}
