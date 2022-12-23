package com.ccu.smbms.service;

import com.ccu.smbms.domain.SmbmsRole;

import java.util.List;

/**
 * @author Wjj
 * @description 针对表【smbms_role】的数据库操作Service
 * @createDate 2022-12-22 10:35:03
 */
public interface SmbmsRoleService {

    List<SmbmsRole> selectSmbmsRoleList(SmbmsRole smbmsRole);

    int insertSmbmsRole(SmbmsRole role);

    int deleteSmbmsRoleById(Long id);

    SmbmsRole selectSmbmsRoleById(Long id);

    int updateSmbmsRole(SmbmsRole role);
}
