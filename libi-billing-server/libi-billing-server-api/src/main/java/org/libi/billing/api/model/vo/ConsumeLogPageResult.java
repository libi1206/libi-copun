package org.libi.billing.api.model.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.libi.common.response.PageResult;

import java.math.BigDecimal;

/**
 * @author liyuchu
 * @date 2021-11-29 19:49
 * @description
 */
@Data
@NoArgsConstructor
public class ConsumeLogPageResult<T> extends PageResult<T> {
    /**
     * 数据总计
     */
    private BigDecimal amount;
}
