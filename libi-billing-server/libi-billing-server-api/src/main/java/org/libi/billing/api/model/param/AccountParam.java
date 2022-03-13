package org.libi.billing.api.model.param;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * description : 用户账户param
 *
 * @author : wanghaifeng
 * date : 2021/9/1
 */
@Getter
@Setter
public class AccountParam {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 账户类型
     *
     */
    private Integer accountType = 0;
    /**
     * 改变金额
     */
    private BigDecimal changeValue;
    /**
     * 关联id
     */
    private String refId;
    /**
     * 关联类型
     *
     */
    private Integer refType;
    /**
     * 场景值
     *
     */
    private Integer sceneType;
    /**
     * 备注
     * 一般不用
     */
    private String remark;
}
