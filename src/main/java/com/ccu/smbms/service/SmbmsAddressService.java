package com.ccu.smbms.service;

import com.ccu.smbms.domain.SmbmsAddress;

import java.util.List;

/**
* @author Wjj
* @description 针对表【smbms_address】的数据库操作Service
* @createDate 2022-12-22 10:35:03
*/
public interface SmbmsAddressService  {

    List<SmbmsAddress> selectSmbmsAddressList(SmbmsAddress address);

    int deleteAddressById(Long id);

    int updateSmbmsAddress(SmbmsAddress address);

    int insertSmbmsAddress(SmbmsAddress address);

    SmbmsAddress selectAddressById(Long id);
}
