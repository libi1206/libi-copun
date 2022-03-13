package org.libi.billing.api.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author :Libi
 * @version :1.0
 * @date :7/29/21 11:29 AM
 * 流水日志的场景值
 */
@Getter
@AllArgsConstructor
public enum LogScenesType {
    CONSUME(0, "消费"),
    RECHARGE(1, "充值"),
    RETURN(2, "回退"),
    EXCHANGE(3, "兑换"),
    REFUND(4,"退款"),
    INVITATION_REWARD(5, "邀请奖励"),
    REGISTER(6, "注册奖励"),
    ;
    Integer code;
    String msg;


}
