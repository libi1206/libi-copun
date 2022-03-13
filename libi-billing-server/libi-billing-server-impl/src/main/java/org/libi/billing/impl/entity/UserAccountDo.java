package org.libi.billing.impl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户账户
 *
 * @author wanghaifeng
 * @date 2021-07-29 20:49:29
 */
@TableName("user_account")
public class UserAccountDo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
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
    @TableLogic
    private Integer isDelete;
    /**
     * 用户Id
     */
    private String userId;
    /**
     * 账户类型 AccountType
     */
    private Integer accountType;
    /**
     * 余额
     */
    private BigDecimal balance;

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
     * 设置：用户Id
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取：用户Id
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
     * 设置：余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取：余额
     */
    public BigDecimal getBalance() {
        return balance;
    }
}
