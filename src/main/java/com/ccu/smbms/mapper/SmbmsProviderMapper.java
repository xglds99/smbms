package com.ccu.smbms.mapper;

import com.ccu.smbms.domain.SmbmsProvider;

import java.util.List;

/**
 * @author Wjj
 * @description 针对表【smbms_provider】的数据库操作Mapper
 * @createDate 2022-12-22 10:35:03
 * @Entity
 */
public interface SmbmsProviderMapper {


    /**
     * 查询
     *
     * @param id 主键
     * @return
     */
    public SmbmsProvider selectSmbmsProviderById(Long id);

    /**
     * 查询列表
     *
     * @param smbmsProvider
     * @return 集合
     */
    public List<SmbmsProvider> selectSmbmsProviderList(SmbmsProvider smbmsProvider);

    /**
     * 新增
     *
     * @param smbmsProvider
     * @return 结果
     */
    public int insertSmbmsProvider(SmbmsProvider smbmsProvider);

    /**
     * 修改
     *
     * @param smbmsProvider
     * @return 结果
     */
    public int updateSmbmsProvider(SmbmsProvider smbmsProvider);

    /**
     * 删除
     *
     * @param id 主键
     * @return 结果
     */
    public int deleteSmbmsProviderById(Long id);

    /**
     * 批量删除
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSmbmsProviderByIds(String[] ids);

}
