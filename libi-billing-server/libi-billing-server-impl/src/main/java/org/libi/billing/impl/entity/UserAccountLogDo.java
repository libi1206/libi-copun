package org.libi.billing.impl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * 
 * @author wanghaifeng
 * @date 2021-07-29 20:49:29
 */
@TableName("user_account_log")
public class UserAccountLogDo implements Serializable {
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
	 * 流水号
	 */
	private String logNo;
	/**
	 * 用户id
	 */
	private String userId;
	/**
	 * 账户类型 AccountType
	 */
	private Integer accountType;
	/**
	 * 改变值，+为充值，-为消费
	 */
	private BigDecimal changeValue;
	/**
	 * 数值变化方向，0为收入，1为支出 LogDirection
	 */
	private Integer direction;
	/**
	 * 场景类型（消费[精确到具体存取证类型]，充值，回退[精确到具体存取证类型]，赠送） SenceType
	 */
	private Integer sceneType;
	/**
	 * 改变之前的值
	 */
	private BigDecimal oldValue;
	/**
	 * 改变之后的值
	 */
	private BigDecimal newValue;
	/**
	 * 是否为回退的流水（0 否 1 是）
	 */
	private Integer isReturn;
	/**
	 * 回退时对应的流水Id
	 */
	private Long returnLogId;
	/**
	 * 引用的id（如存取证的id，订单的订单号，等）
	 */
	private String refId;
	/**
	 * 引用的类型（比如存取证类型等）
	 */
	private Integer refType;
	/**
	 * 备注
	 */
	private String remark;

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
	 * 设置：流水号
	 */
	public void setLogNo(String logNo) {
		this.logNo = logNo;
	}
	/**
	 * 获取：流水号
	 */
	public String getLogNo() {
		return logNo;
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
	 * 设置：账户类型 AccountType
	 */
	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}
	/**
	 * 获取：账户类型 AccountType
	 */
	public Integer getAccountType() {
		return accountType;
	}
	/**
	 * 设置：改变值，+为充值，-为消费
	 */
	public void setChangeValue(BigDecimal changeValue) {
		this.changeValue = changeValue;
	}
	/**
	 * 获取：改变值，+为充值，-为消费
	 */
	public BigDecimal getChangeValue() {
		return changeValue;
	}
	/**
	 * 设置：数值变化方向，0为收入，1为支出 LogDirection
	 */
	public void setDirection(Integer direction) {
		this.direction = direction;
	}
	/**
	 * 获取：数值变化方向，0为收入，1为支出 LogDirection
	 */
	public Integer getDirection() {
		return direction;
	}
	/**
	 * 设置：场景类型（消费[精确到具体存取证类型]，充值，回退[精确到具体存取证类型]，赠送） SenceType
	 */
	public void setSceneType(Integer sceneType) {
		this.sceneType = sceneType;
	}
	/**
	 * 获取：场景类型（消费[精确到具体存取证类型]，充值，回退[精确到具体存取证类型]，赠送） SenceType
	 */
	public Integer getSceneType() {
		return sceneType;
	}
	/**
	 * 设置：改变之前的值
	 */
	public void setOldValue(BigDecimal oldValue) {
		this.oldValue = oldValue;
	}
	/**
	 * 获取：改变之前的值
	 */
	public BigDecimal getOldValue() {
		return oldValue;
	}
	/**
	 * 设置：改变之后的值
	 */
	public void setNewValue(BigDecimal newValue) {
		this.newValue = newValue;
	}
	/**
	 * 获取：改变之后的值
	 */
	public BigDecimal getNewValue() {
		return newValue;
	}
	/**
	 * 设置：是否为回退的流水（0 否 1 是）
	 */
	public void setIsReturn(Integer isReturn) {
		this.isReturn = isReturn;
	}
	/**
	 * 获取：是否为回退的流水（0 否 1 是）
	 */
	public Integer getIsReturn() {
		return isReturn;
	}
	/**
	 * 设置：回退时对应的流水Id
	 */
	public void setReturnLogId(Long returnLogId) {
		this.returnLogId = returnLogId;
	}
	/**
	 * 获取：回退时对应的流水Id
	 */
	public Long getReturnLogId() {
		return returnLogId;
	}
	/**
	 * 设置：引用的id（如存取证的id，订单的订单号，等）
	 */
	public void setRefId(String refId) {
		this.refId = refId;
	}
	/**
	 * 获取：引用的id（如存取证的id，订单的订单号，等）
	 */
	public String getRefId() {
		return refId;
	}
	/**
	 * 设置：引用的类型（比如存取证类型等）
	 */
	public void setRefType(Integer refType) {
		this.refType = refType;
	}
	/**
	 * 获取：引用的类型（比如存取证类型等）
	 */
	public Integer getRefType() {
		return refType;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
}
