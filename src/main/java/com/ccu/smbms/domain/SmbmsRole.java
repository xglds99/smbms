package com.ccu.smbms.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName smbms_role
 */
public class SmbmsRole implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 角色编码
     */
    private String roleCode;

    /**
     * 角色名称
     */
    private String roleName;

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
     * 角色编码
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * 角色编码
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    /**
     * 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
        SmbmsRole other = (SmbmsRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoleCode() == null ? other.getRoleCode() == null : this.getRoleCode().equals(other.getRoleCode()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getModifyBy() == null ? other.getModifyBy() == null : this.getModifyBy().equals(other.getModifyBy()))
            && (this.getModifyDate() == null ? other.getModifyDate() == null : this.getModifyDate().equals(other.getModifyDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoleCode() == null) ? 0 : getRoleCode().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getModifyBy() == null) ? 0 : getModifyBy().hashCode());
        result = prime * result + ((getModifyDate() == null) ? 0 : getModifyDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", roleName=").append(roleName);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", modifyBy=").append(modifyBy);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}