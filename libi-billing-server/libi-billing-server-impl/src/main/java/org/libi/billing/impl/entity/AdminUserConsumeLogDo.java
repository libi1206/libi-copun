package org.libi.billing.impl.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 管理员获取用户消费记录表
 * 
 * @author wanghaifeng
 * @date 2021-08-05 17:46:10
 */

@Getter
@Setter
@ToString
public class AdminUserConsumeLogDo {

	/**
	 * 
	 */
	private Long id;
	/**
	 * 
	 */
	private Date createTime;
	/**
	 * 流水id
	 */
	private String logId;
	/**
	 * 存取证类型
	 */
	private Integer evidenceType;
	/**
	 * 存证名称
	 */
	private String evidenceName;
	/**
	 * 消费金额
	 */
	private BigDecimal cost;

	/**
	 * 取证时长
	 */
	private String duration;

	/**
	 * 用户id
	 */
	private String userId;


//	/**
//	 * 用户名
//	 */
//	private String userName;
//
//	/**
//	 * 电话号码
//	 */
//	private String phone;
}
