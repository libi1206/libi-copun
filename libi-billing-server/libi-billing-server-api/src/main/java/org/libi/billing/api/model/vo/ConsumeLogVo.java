package org.libi.billing.api.model.vo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author :Libi
 * @version :1.0
 * @date :7/30/21 6:27 PM
 */
@Data
public class ConsumeLogVo {
    private Long id;
    /**
     * 流水号
     */
    private String logNo;
    /**
     * 消费名称
     */
    private String consumeName;
    /**
     * 消费完成时间
     */
    private Date consumeTime;
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
     * 消费数量（次数或者时间）
     */
    private String consumeNumber;

}
