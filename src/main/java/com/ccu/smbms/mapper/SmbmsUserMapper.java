package com.ccu.smbms.mapper;

import com.ccu.smbms.domain.SmbmsUser;

import java.util.List;

/**
 * @author Wjj
 * @description 针对表【smbms_user】的数据库操作Mapper
 * @createDate 2022-12-22 10:35:03
 * @Entity generator.domain.SmbmsUser
 */
public interface SmbmsUserMapper {
    public List<SmbmsUser> selectSmbmsUserList(SmbmsUser smbmsUser);

    public SmbmsUser selectSmbmsUserById(Long id);

    public int insertSmbmsUser(SmbmsUser smbmsUser);

    public int updateSmbmsUser(SmbmsUser smbmsUser);

    public int deleteSmbmsUserById(Long id);


}
