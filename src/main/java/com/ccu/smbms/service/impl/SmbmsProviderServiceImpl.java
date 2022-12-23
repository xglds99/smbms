package com.ccu.smbms.service.impl;

import com.ccu.smbms.domain.SmbmsProvider;
import com.ccu.smbms.mapper.SmbmsProviderMapper;
import com.ccu.smbms.service.SmbmsProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wjj
 * @description 针对表【smbms_provider】的数据库操作Service实现
 * @createDate 2022-12-22 10:35:03
 */
@Service
public class SmbmsProviderServiceImpl implements SmbmsProviderService {

    @Autowired
    private SmbmsProviderMapper providerMapper;

    @Override
    public List<SmbmsProvider> selectSmbmsProviderList(SmbmsProvider provider) {
        return providerMapper.selectSmbmsProviderList(provider);
    }

    @Override
    public int deleteSmbmsProviderById(Long id) {
        return providerMapper.deleteSmbmsProviderById(id);
    }

    @Override
    public SmbmsProvider selectSmbmsProviderById(Long id) {
        return providerMapper.selectSmbmsProviderById(id);
    }

    @Override
    public int updateSmbmsProvider(SmbmsProvider provider) {
        return providerMapper.updateSmbmsProvider(provider);
    }

    @Override
    public int insertSmbmsProvider(SmbmsProvider provider) {
        return providerMapper.insertSmbmsProvider(provider);
    }
}
