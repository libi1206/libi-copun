package org.libi.billing.api.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author :Libi
 * @version :1.0
 * @date :8/2/21 1:13 PM
 */
@Getter
@AllArgsConstructor
public enum DirectionType {
    INCOME(0,"收入"),
    EXPENDITURE(1, "支出"),
    ;
    Integer code;
    String msg;
}
