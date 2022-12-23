package com.ccu.smbms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName smbms_address
 */
public class SmbmsAddress implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 联系人姓名
     */
    private String contact;

    /**
     * 收货地址明细
     */
    private String addressDesc;

    /**
     * 邮编
     */
    private String postCode;

    /**
     * 联系人电话
     */
    private String tel;

    /**
     * 创建者
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    private Date creationDate;

    /**
     * 修改者
     */
    private Long modifyBy;

    /**
     * 修改时间
     */
    private Date modifyDate;

    /**
     * 用户ID
     */
    private Long userId;

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
     * 联系人姓名
     */
    public String getContact() {
        return contact;
    }

    /**
     * 联系人姓名
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * 收货地址明细
     */
    public String getAddressDesc() {
        return addressDesc;
    }

    /**
     * 收货地址明细
     */
    public void setAddressDesc(String addressDesc) {
        this.addressDesc = addressDesc;
    }

    /**
     * 邮编
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * 邮编
     */
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    /**
     * 联系人电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 联系人电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 创建者
     */
    public Long getCreatedBy() {
        return createdBy;
    }

    /**
     * 创建者
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
     * 修改者
     */
    public Long getModifyBy() {
        return modifyBy;
    }

    /**
     * 修改者
     */
    public void setModifyBy(Long modifyBy) {
        this.modifyBy = modifyBy;
    }

    /**
     * 修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
        SmbmsAddress other = (SmbmsAddress) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getContact() == null ? other.getContact() == null : this.getContact().equals(other.getContact()))
            && (this.getAddressDesc() == null ? other.getAddressDesc() == null : this.getAddressDesc().equals(other.getAddressDesc()))
            && (this.getPostCode() == null ? other.getPostCode() == null : this.getPostCode().equals(other.getPostCode()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getModifyBy() == null ? other.getModifyBy() == null : this.getModifyBy().equals(other.getModifyBy()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContact() == null) ? 0 : getContact().hashCode());
        result = prime * result + ((getAddressDesc() == null) ? 0 : getAddressDesc().hashCode());
        result = prime * result + ((getPostCode() == null) ? 0 : getPostCode().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getModifyBy() == null) ? 0 : getModifyBy().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contact=").append(contact);
        sb.append(", addressDesc=").append(addressDesc);
        sb.append(", postCode=").append(postCode);
        sb.append(", tel=").append(tel);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", modifyBy=").append(modifyBy);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}