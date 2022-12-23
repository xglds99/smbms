package com.ccu.smbms.service.impl;

import com.ccu.smbms.domain.SmbmsRole;
import com.ccu.smbms.mapper.SmbmsRoleMapper;
import com.ccu.smbms.service.SmbmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wjj
 * @description 针对表【smbms_role】的数据库操作Service实现
 * @createDate 2022-12-22 10:35:03
 */
@Service
public class SmbmsRoleServiceImpl implements SmbmsRoleService {

    @Autowired
    private SmbmsRoleMapper roleMapper;

    @Override
    public List<SmbmsRole> selectSmbmsRoleList(SmbmsRole smbmsRole) {
        return roleMapper.selectSmbmsRoleList(smbmsRole);
    }

    /**
     * 插入角色信息
     * @param role
     * @return
     */
    @Override
    public int insertSmbmsRole(SmbmsRole role) {
        return roleMapper.insertSmbmsRole(role);
    }

    /**
     * 根据id删除角色
     * @param id
     * @return
     */
    @Override
    public int deleteSmbmsRoleById(Long id) {
        return roleMapper.deleteSmbmsRoleById(id);
    }

    @Override
    public SmbmsRole selectSmbmsRoleById(Long id) {
        return roleMapper.selectSmbmsRoleById(id);
    }

    @Override
    public int updateSmbmsRole(SmbmsRole role) {
        return roleMapper.updateSmbmsRole(role);
    }
}
