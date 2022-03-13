package org.libi.billing.api.model.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author :Libi
 * @version :1.0
 * @date :8/11/21 7:59 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BalanceQuery {
    // userAccount账户表Id
    Long id;
    // 账户余额
    BigDecimal balance;
}
