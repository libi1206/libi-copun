package org.libi.billing.api.model.param;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author :Libi
 * @version :1.0
 * @date :9/7/21 2:15 PM
 */
@Data
public class ConsumeLogInsertParam {
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 消费的存取证ID
     */
    private String evidenceId;
    /**
     * 存取证名称
     */
    private String evidenceName;
    /**
     * 消费的存取证类型
     */
    private Integer evidenceType;
    /**
     * 扣费的账户类型
     */
    private Integer accountType;
    /**
     * 扣费额度
     */
    private BigDecimal cost;
    /**
     * 消费次数（时长OR次数）
     */
    private String duration;


}
