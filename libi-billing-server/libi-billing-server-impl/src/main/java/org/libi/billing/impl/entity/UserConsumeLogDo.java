package org.libi.billing.impl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户消费记录表
 * 
 * @author wanghaifeng
 * @date 2021-08-05 17:46:10
 */
@TableName("user_consume_log")
public class UserConsumeLogDo implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
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
	private Integer isDelete;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 流水id
	 */
	private String logId;
	/**
	 * 存取证id
	 */
	private String evidenceId;
	/**
	 * 证据名称
	 */
	private String evidenceName;
	/**
	 * 存取证类型
	 */
	private Integer evidenceType;
	/**
	 * 消费金额
	 */
	private BigDecimal cost;
	/**
	 * 消耗的账号类型
	 */
	private Integer accountType;
	/**
	 * 取证时长
	 */
	private String duration;

	/**
	 * 设置：
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Long getId() {
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
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：
	 */
	public Integer getIsDelete() {
		return isDelete;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * 设置：流水id
	 */
	public void setLogId(String logId) {
		this.logId = logId;
	}
	/**
	 * 获取：流水id
	 */
	public String getLogId() {
		return logId;
	}
	/**
	 * 设置：存取证id
	 */
	public void setEvidenceId(String evidenceId) {
		this.evidenceId = evidenceId;
	}
	/**
	 * 获取：存取证id
	 */
	public String getEvidenceId() {
		return evidenceId;
	}
	/**
	 * 设置：证据名称
	 */
	public void setEvidenceName(String evidenceName) {
		this.evidenceName = evidenceName;
	}
	/**
	 * 获取：证据名称
	 */
	public String getEvidenceName() {
		return evidenceName;
	}
	/**
	 * 设置：存取证类型
	 */
	public void setEvidenceType(Integer evidenceType) {
		this.evidenceType = evidenceType;
	}
	/**
	 * 获取：存取证类型
	 */
	public Integer getEvidenceType() {
		return evidenceType;
	}
	/**
	 * 设置：消费金额
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	/**
	 * 获取：消费金额
	 */
	public BigDecimal getCost() {
		return cost;
	}
	/**
	 * 设置：消耗的账号类型
	 */
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}
	/**
	 * 获取：消耗的账号类型
	 */
	public Integer getAccountType() {
		return accountType;
	}
	/**
	 * 设置：取证时长
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}
	/**
	 * 获取：取证时长
	 */
	public String getDuration() {
		return duration;
	}
}
