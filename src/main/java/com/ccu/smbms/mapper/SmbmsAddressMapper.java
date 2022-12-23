package com.ccu.smbms.mapper;

import com.ccu.smbms.domain.SmbmsAddress;
import com.ccu.smbms.domain.SmbmsUser;

import java.util.List;

/**
* @author Wjj
* @description 针对表【smbms_address】的数据库操作Mapper
* @createDate 2022-12-22 10:35:03
* @Entity generator.domain.SmbmsAddress
*/
public interface SmbmsAddressMapper  {


    List<SmbmsAddress> selectSmbmsAddressList(SmbmsAddress address);

    int deleteAddressById(Long id);

    int updateSmbmsAddress(SmbmsAddress address);

    int insertSmbmsAddress(SmbmsAddress address);

    SmbmsAddress selectAddressById(Long id);
}
