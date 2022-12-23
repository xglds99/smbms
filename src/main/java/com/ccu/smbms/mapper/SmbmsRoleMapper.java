package com.ccu.smbms.mapper;

import com.ccu.smbms.domain.SmbmsRole;

import java.util.List;

/**
* @author Wjj
* @description 针对表【smbms_role】的数据库操作Mapper
* @createDate 2022-12-22 10:35:03
* @Entity generator.domain.SmbmsRole
*/
public interface SmbmsRoleMapper  {
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public SmbmsRole selectSmbmsRoleById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param smbmsRole 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<SmbmsRole> selectSmbmsRoleList(SmbmsRole smbmsRole);

    /**
     * 新增【请填写功能名称】
     *
     * @param smbmsRole 【请填写功能名称】
     * @return 结果
     */
    public int insertSmbmsRole(SmbmsRole smbmsRole);

    /**
     * 修改【请填写功能名称】
     *
     * @param smbmsRole 【请填写功能名称】
     * @return 结果
     */
    public int updateSmbmsRole(SmbmsRole smbmsRole);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteSmbmsRoleById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSmbmsRoleByIds(String[] ids);
}
