package org.libi.billing.api.model.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author :Libi
 * @version :1.0
 * @date :9/3/21 3:00 PM
 */
@Data
public class GiftConfVO {
    private Integer accountType;
    private BigDecimal amount;
    private String desc;
}
