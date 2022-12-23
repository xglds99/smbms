package com.ccu.smbms.service.impl;

import com.ccu.smbms.domain.SmbmsAddress;
import com.ccu.smbms.domain.SmbmsUser;
import com.ccu.smbms.mapper.SmbmsAddressMapper;
import com.ccu.smbms.service.SmbmsAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wjj
 * @description 针对表【smbms_address】的数据库操作Service实现
 * @createDate 2022-12-22 10:35:03
 */
@Service
public class SmbmsAddressServiceImpl implements SmbmsAddressService {

    @Autowired
    private SmbmsAddressMapper addressMapper;

    @Override
    public List<SmbmsAddress> selectSmbmsAddressList(SmbmsAddress address) {
        return addressMapper.selectSmbmsAddressList(address);
    }

    @Override
    public int deleteAddressById(Long id) {
        return addressMapper.deleteAddressById(id);
    }

    @Override
    public int updateSmbmsAddress(SmbmsAddress address) {
        return addressMapper.updateSmbmsAddress(address);
    }

    @Override
    public int insertSmbmsAddress(SmbmsAddress address) {
        return addressMapper.insertSmbmsAddress(address);
    }

    @Override
    public SmbmsAddress selectAddressById(Long id) {
        return addressMapper.selectAddressById(id);
    }
}
