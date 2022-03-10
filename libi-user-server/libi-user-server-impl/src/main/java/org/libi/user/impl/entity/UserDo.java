package org.libi.user.impl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 
 * @author libi
 * @date 2022-03-10 23:31:24
 */
@TableName("user")
public class UserDo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 主键uuid
	 */
	@TableId
	private String id;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 
	 */
	private Date updateTime;
	/**
	 * 
	 */
	private Integer version;
	/**
	 * 认证状态
	 */
	private Integer authStatus;
	/**
	 * 认证类型
	 */
	private Integer authType;
	/**
	 * 账号错误次数
	 */
	private Integer errorCount;
	/**
	 * 
	 */
	private Date lockTime;
	/**
	 * 存证最大使用次数
	 */
	private Integer maxCount;
	/**
	 * 手机号码
	 */
	private String phone;
	/**
	 * 用户状态
	 */
	private Integer status;
	/**
	 * 邮箱地址
	 */
	private String email;
	/**
	 * 邮箱状态
	 */
	private Integer emailStatus;
	/**
	 * 微信号
	 */
	private String openId;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 
	 */
	private Integer deleted;

	/**
	 * 设置：主键uuid
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：主键uuid
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}
	/**
	 * 获取：
	 */
	public Integer getVersion() {
		return version;
	}
	/**
	 * 设置：认证状态
	 */
	public void setAuthStatus(Integer authStatus) {
		this.authStatus = authStatus;
	}
	/**
	 * 获取：认证状态
	 */
	public Integer getAuthStatus() {
		return authStatus;
	}
	/**
	 * 设置：认证类型
	 */
	public void setAuthType(Integer authType) {
		this.authType = authType;
	}
	/**
	 * 获取：认证类型
	 */
	public Integer getAuthType() {
		return authType;
	}
	/**
	 * 设置：账号错误次数
	 */
	public void setErrorCount(Integer errorCount) {
		this.errorCount = errorCount;
	}
	/**
	 * 获取：账号错误次数
	 */
	public Integer getErrorCount() {
		return errorCount;
	}
	/**
	 * 设置：
	 */
	public void setLockTime(Date lockTime) {
		this.lockTime = lockTime;
	}
	/**
	 * 获取：
	 */
	public Date getLockTime() {
		return lockTime;
	}
	/**
	 * 设置：存证最大使用次数
	 */
	public void setMaxCount(Integer maxCount) {
		this.maxCount = maxCount;
	}
	/**
	 * 获取：存证最大使用次数
	 */
	public Integer getMaxCount() {
		return maxCount;
	}
	/**
	 * 设置：手机号码
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * 获取：手机号码
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * 设置：用户状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：用户状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：邮箱地址
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：邮箱地址
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：邮箱状态
	 */
	public void setEmailStatus(Integer emailStatus) {
		this.emailStatus = emailStatus;
	}
	/**
	 * 获取：邮箱状态
	 */
	public Integer getEmailStatus() {
		return emailStatus;
	}
	/**
	 * 设置：微信号
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * 获取：微信号
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：用户名
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * 获取：用户名
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * 设置：
	 */
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	/**
	 * 获取：
	 */
	public Integer getDeleted() {
		return deleted;
	}
}
