package com.ccu.smbms.service.impl;

import com.ccu.smbms.domain.SmbmsBill;
import com.ccu.smbms.mapper.SmbmsBillMapper;
import com.ccu.smbms.service.SmbmsBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wjj
 * @description 针对表【smbms_bill】的数据库操作Service实现
 * @createDate 2022-12-22 10:35:03
 */
@Service
public class SmbmsBillServiceImpl implements SmbmsBillService {

    @Autowired
    private SmbmsBillMapper billMapper;

    @Override
    public List<SmbmsBill> selectSmbmsBillList(SmbmsBill bill) {
        return billMapper.selectSmbmsBillList(bill);
    }

    @Override
    public int deleteSmbmsBillById(Long id) {
        return billMapper.deleteSmbmsBillById(id);
    }

    @Override
    public SmbmsBill selectSmbmsBillById(Long id) {
        return billMapper.selectSmbmsBillById(id);
    }

    @Override
    public int updateSmbmsBill(SmbmsBill bill) {
        return billMapper.updateSmbmsBill(bill);
    }

    @Override
    public int insertSmbmsBill(SmbmsBill bill) {
        return billMapper.insertSmbmsBill(bill);
    }

    @Override
    public Long getLatestId() {
        return billMapper.getLatestId();
    }
}
