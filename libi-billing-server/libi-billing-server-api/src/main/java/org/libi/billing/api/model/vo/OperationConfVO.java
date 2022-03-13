package org.libi.billing.api.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author :Libi
 * @version :1.0
 * @date :8/6/21 8:05 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OperationConfVO {
    private String name;                    //存取证名称
    private String sizeType;                //收费类型
    private Integer maxSize;                //最长取证时间，最大存证大小
    private BigDecimal flagFall;            //起步价
    private BigDecimal flagFallOff;         //折扣价
    private Integer flagFallSize;           //起步收费时间
    private BigDecimal overPricing;         //每单位收费
    private Integer overPricingUnit;        //超过起步价的收费单位（每x分钟收费一次）
    private String limitDescp;
    private String feeDescp;
}
