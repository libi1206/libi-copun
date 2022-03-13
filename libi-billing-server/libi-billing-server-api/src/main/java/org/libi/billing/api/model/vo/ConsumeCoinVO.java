package org.libi.billing.api.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author liyuchu
 * @date 2022-01-07 15:04
 * @description 单用户的消耗印币的数量，目前被用于账户流水表中的消费统计
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConsumeCoinVO {

    private String userId;
    /**
     * 印币消耗数量
     */
    private BigDecimal consumeCoin;
}
