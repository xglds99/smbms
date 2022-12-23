package com.ccu.smbms.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName smbms_user
 */
public class SmbmsUser implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * 用户编码
     */
    private String userCode;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 性别（1:女、 2:男）
     */
    private Integer gender;

    /**
     * 出生日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date birthday;

    /**
     * 手机
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 用户角色（取自角色表-角色id）
     */
    private Integer userRole;

    /**
     * 创建者（userId）
     */
    private Long createdBy;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date creationDate;

    /**
     * 更新者（userId）
     */
    private Long modifyBy;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifyDate;

    /**
     * 角色
     */
    private String roleName;

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
     * 用户编码
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 用户编码
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 性别（1:女、 2:男）
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 性别（1:女、 2:男）
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 出生日期
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 出生日期
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 手机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 用户角色（取自角色表-角色id）
     */
    public Integer getUserRole() {
        return userRole;
    }

    /**
     * 用户角色（取自角色表-角色id）
     */
    public void setUserRole(Integer userRole) {
        this.userRole = userRole;
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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
        SmbmsUser other = (SmbmsUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserCode() == null ? other.getUserCode() == null : this.getUserCode().equals(other.getUserCode()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getUserPassword() == null ? other.getUserPassword() == null : this.getUserPassword().equals(other.getUserPassword()))
            && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUserRole() == null ? other.getUserRole() == null : this.getUserRole().equals(other.getUserRole()))
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
        result = prime * result + ((getUserCode() == null) ? 0 : getUserCode().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getUserPassword() == null) ? 0 : getUserPassword().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUserRole() == null) ? 0 : getUserRole().hashCode());
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
        sb.append(", userCode=").append(userCode);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", gender=").append(gender);
        sb.append(", birthday=").append(birthday);
        sb.append(", phone=").append(phone);
        sb.append(", address=").append(address);
        sb.append(", userRole=").append(userRole);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", modifyBy=").append(modifyBy);
        sb.append(", modifyDate=").append(modifyDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}