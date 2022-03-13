package org.libi.billing.api.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author :Libi
 * @version :1.0
 * @date :8/2/21 11:02 AM
 * 钱包中的账户类型
 */
@Getter
@AllArgsConstructor
public enum AccountType {
    INK_COIN(1,"印币账户"),
    ;
    private Integer code;
    private String message;
}
