package com.ccu.smbms.service.impl;

import com.ccu.smbms.domain.SmbmsUser;
import com.ccu.smbms.mapper.SmbmsUserMapper;
import com.ccu.smbms.service.SmbmsUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wjj
 * @description 针对表【smbms_user】的数据库操作Service实现
 * @createDate 2022-12-22 10:35:03
 */
@Service
public class SmbmsUserServiceImpl implements SmbmsUserService {

    @Autowired
    private SmbmsUserMapper userMapper;

    @Override
    public List<SmbmsUser> selectSmbmsUserList(SmbmsUser smbmsUser) {
        return userMapper.selectSmbmsUserList(smbmsUser);
    }

    @Override
    public SmbmsUser selectSmbmsUserById(Long id) {
        return userMapper.selectSmbmsUserById(id);
    }

    @Override
    public int insertSmbmsUser(SmbmsUser smbmsUser) {
        return userMapper.insertSmbmsUser(smbmsUser);
    }

    @Override
    public int updateSmbmsUser(SmbmsUser smbmsUser) {
        return userMapper.updateSmbmsUser(smbmsUser);
    }

    @Override
    public int deleteSmbmsUserById(Long id) {
        return userMapper.deleteSmbmsUserById(id);
    }
}
