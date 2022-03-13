package org.libi.billing.api.model.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author :Libi
 * @version :1.0
 * @date :1/17/22 4:34 PM
 */
@Data
public class InvitationRewardConfVO {
    /**
     * 邀请用户的奖励数量
     */
    private BigDecimal invitationReward;
    /**
     * 充值达标的数量
     */
    private BigDecimal rechargeNumber;
    /**
     * 奖励的类型
     */
    private Integer accountType;
    /**
     * 充值达到一定数量后的奖励数量
     */
    private BigDecimal rechargeReward;
    /**
     * 描述
     */
    private String desp;
}
