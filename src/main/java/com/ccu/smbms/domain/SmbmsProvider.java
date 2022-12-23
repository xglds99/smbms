package com.ccu.smbms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName smbms_provider
 */
public class SmbmsProvider implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 供应商编码
     */
    private String proCode;

    /**
     * 供应商名称
     */
    private String proName;

    /**
     * 供应商详细描述
     */
    private String proDesc;

    /**
     * 供应商联系人
     */
    private String proContact;

    /**
     * 联系电话
     */
    private String proPhone;

    /**
     * 地址
     */
    private String proAddress;

    /**
     * 微信
     */
    private String proFax;

    /**
     * 创建者（userId）
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private Date creationDate;

    /**
     * 更新时间
     */
    private Date modifyDate;

    /**
     * 更新者（userId）
     */
    private Long modifyBy;

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 供应商编码
     */
    public String getProCode() {
        return proCode;
    }

    /**
     * 供应商编码
     */
    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    /**
     * 供应商名称
     */
    public String getProName() {
        return proName;
    }

    /**
     * 供应商名称
     */
    public void setProName(String proName) {
        this.proName = proName;
    }

    /**
     * 供应商详细描述
     */
    public String getProDesc() {
        return proDesc;
    }

    /**
     * 供应商详细描述
     */
    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    /**
     * 供应商联系人
     */
    public String getProContact() {
        return proContact;
    }

    /**
     * 供应商联系人
     */
    public void setProContact(String proContact) {
        this.proContact = proContact;
    }

    /**
     * 联系电话
     */
    public String getProPhone() {
        return proPhone;
    }

    /**
     * 联系电话
     */
    public void setProPhone(String proPhone) {
        this.proPhone = proPhone;
    }

    /**
     * 地址
     */
    public String getProAddress() {
        return proAddress;
    }

    /**
     * 地址
     */
    public void setProAddress(String proAddress) {
        this.proAddress = proAddress;
    }

    /**
     * 微信
     */
    public String getProFax() {
        return proFax;
    }

    /**
     * 微信
     */
    public void setProFax(String proFax) {
        this.proFax = proFax;
    }

    /**
     * 创建者（userId）
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * 创建者（userId）
     */
    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 创建时间
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * 创建时间
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * 更新时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 更新时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 更新者（userId）
     */
    public Long getModifyBy() {
        return modifyBy;
    }

    /**
     * 更新者（userId）
     */
    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SmbmsProvider other = (SmbmsProvider) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getProCode() == null ? other.getProCode() == null : this.getProCode().equals(other.getProCode()))
            && (this.getProName() == null ? other.getProName() == null : this.getProName().equals(other.getProName()))
            && (this.getProDesc() == null ? other.getProDesc() == null : this.getProDesc().equals(other.getProDesc()))
            && (this.getProContact() == null ? other.getProContact() == null : this.getProContact().equals(other.getProContact()))
            && (this.getProPhone() == null ? other.getProPhone() == null : this.getProPhone().equals(other.getProPhone()))
            && (this.getProAddress() == null ? other.getProAddress() == null : this.getProAddress().equals(other.getProAddress()))
            && (this.getProFax() == null ? other.getProFax() == null : this.getProFax().equals(other.getProFax()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getModifyBy() == null ? other.getModifyBy() == null : this.getModifyBy().equals(other.getModifyBy()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getProCode() == null) ? 0 : getProCode().hashCode());
        result = prime * result + ((getProName() == null) ? 0 : getProName().hashCode());
        result = prime * result + ((getProDesc() == null) ? 0 : getProDesc().hashCode());
        result = prime * result + ((getProContact() == null) ? 0 : getProContact().hashCode());
        result = prime * result + ((getProPhone() == null) ? 0 : getProPhone().hashCode());
        result = prime * result + ((getProAddress() == null) ? 0 : getProAddress().hashCode());
        result = prime * result + ((getProFax() == null) ? 0 : getProFax().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getModifyBy() == null) ? 0 : getModifyBy().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", proCode=").append(proCode);
        sb.append(", proName=").append(proName);
        sb.append(", proDesc=").append(proDesc);
        sb.append(", proContact=").append(proContact);
        sb.append(", proPhone=").append(proPhone);
        sb.append(", proAddress=").append(proAddress);
        sb.append(", proFax=").append(proFax);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", modifyBy=").append(modifyBy);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}