package org.libi.billing.api.model.param;

import lombok.Data;
import org.libi.billing.api.constant.AccountType;
import org.libi.billing.api.constant.SizeType;

import java.math.BigDecimal;

/**
 * @author :Libi
 * @version :1.0
 * @date :9/7/21 2:52 PM
 */
@Data
public class ConsumeLogBusinessParam {
    /**
     * 业务ID
     */
    private String businessId;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 话费
     */
    private BigDecimal cost;
    /**
     * 计费方式
     */
    private SizeType sizeType;
    /**
     * 话费数量
     */
    private Integer duration;
    /**
     * 账户类型
     */
    private AccountType accountType;
    /**
     * 消费类型
     */
    private Integer consumeType;
    /**
     * 消费名称
     */
    private String consumeName;
    

}
