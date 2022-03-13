package org.libi.billing.api.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author :Libi
 * @version :1.0
 * @date :9/7/21 2:53 PM
 * 计费单位
 */
@Getter
@AllArgsConstructor
public enum  SizeType {
    /**
     * 按照次数计费
     */
    QUANTITY,
    /**
     * 按照分钟计费
     */
    MINUTE,
}
