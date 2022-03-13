package org.libi.billing.api.constant;

import lombok.Getter;

/**
 * @author :Libi
 * @version :1.0
 * @date :9/28/21 3:32 PM
 * 计费的回调状态
 */
@Getter
public enum  CallbackStatus {
    /**
     * 回调成功，进行后续扣费
     */
    SUCCESS,
    /**
     * 业务进行中
     */
    WAITING,
    /**
     * 业务失败，回退费用
     */
    FAILED,

}
