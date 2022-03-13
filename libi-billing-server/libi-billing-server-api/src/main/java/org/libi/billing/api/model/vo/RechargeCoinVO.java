package org.libi.billing.api.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author liyuchu
 * @date 2022-01-07 15:04
 * @description 账户流水表中的充值次数与充值金额的统计
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RechargeCoinVO {

    private String userId;
    /**
     * 印币充值金额
     */
    private BigDecimal rechargeCoin;
    /**
     * 印币充值次数
     */
    private Integer rechargeNum;
}
