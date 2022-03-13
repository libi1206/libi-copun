package org.libi.billing.api.model.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author :Libi
 * @version :1.0
 * @date :7/30/21 7:22 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminConsumeLogItemVO {
    private Long id;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户电话号吗
     */
    private String phone;
    /**
     * 流水号
     */
    private String logNo;
    /**
     * 消费名称
     */
    private String name;
    /**
     * 消费类型（存取证类型）
     */
    private Integer logType;
    /**
     * 消费类型描述
     */
    private String logTypeDesc;
    /**
     * 创建时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    /**
     * 消费数量（分钟数或者次数）
     */
    private String consumeDesc;
    /**
     * 话费印币数
     */
    private BigDecimal cost;
}
