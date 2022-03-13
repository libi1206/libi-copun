package org.libi.billing.api.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.libi.common.model.PageDTO;

/**
 * description :
 *
 * @author : wanghaifeng
 * date : 2021/8/3
 */
@Getter
@Setter
@ToString
public class AdminConsumeLogDTO extends PageDTO {

    /**
     * 支付成功开始时间
     */
    private String startTime;

    /**
     * 支付成功结束时间
     */
    private String endTime;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 消费来源
     */
    private Integer logType;

}
