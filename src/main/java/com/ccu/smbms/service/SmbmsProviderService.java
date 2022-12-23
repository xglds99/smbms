package com.ccu.smbms.service;

import com.ccu.smbms.domain.SmbmsProvider;

import java.util.List;

/**
 * @author Wjj
 * @description 针对表【smbms_provider】的数据库操作Service
 * @createDate 2022-12-22 10:35:03
 */
public interface SmbmsProviderService {

    List<SmbmsProvider> selectSmbmsProviderList(SmbmsProvider provider);

    int deleteSmbmsProviderById(Long id);

    SmbmsProvider selectSmbmsProviderById(Long id);

    int updateSmbmsProvider(SmbmsProvider provider);

    int insertSmbmsProvider(SmbmsProvider provider);
}
