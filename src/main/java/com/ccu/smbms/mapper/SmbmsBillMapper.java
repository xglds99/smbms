package com.ccu.smbms.mapper;

import com.ccu.smbms.domain.SmbmsBill;

import java.util.List;

/**
* @author Wjj
* @description 针对表【smbms_bill】的数据库操作Mapper
* @createDate 2022-12-22 10:35:03
* @Entity generator.domain.SmbmsBill
*/
public interface SmbmsBillMapper {


    List<SmbmsBill> selectSmbmsBillList(SmbmsBill bill);

    int deleteSmbmsBillById(Long id);

    SmbmsBill selectSmbmsBillById(Long id);

    int updateSmbmsBill(SmbmsBill bill);

    int insertSmbmsBill(SmbmsBill bill);

    Long getLatestId();

}
