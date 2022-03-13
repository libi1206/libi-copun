package org.libi.billing.api.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * description : 通用关联类型
 *
 * @author : wanghaifeng
 * date : 2021/9/1
 */
@Getter
@AllArgsConstructor
public enum RefType {
    EXCHANGE_ACTIVITY_EXCHANGE_RECORD(1, "兑换活动兑换记录表"),
    EVIDENCE_RECORD(2, "存证表"),
    FORENSICS_RECORD(3, "取证表"),
    ORDER_RECORD(4, "订单表"),
    OPEN_EVIDENCE_RECORD(5,"开放存证表"),
    EVIDENCE_CONFIRMATION_RECORD(6,"存证确认函表"),
    ORDER_REFUND_RECORD(7,"订单退款申请记录表")
    ;
    private Integer code;
    private String desc;
}
