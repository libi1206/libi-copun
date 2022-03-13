package org.libi.billing.api.model.param;

import lombok.Data;

/**
 * @author :Libi
 * @version :1.0
 * @date :9/3/21 3:43 PM
 */
@Data
public class AccountCreateParam {
    /**
     * 用户Id
     */
    private String userId;

    /**
     * 账户类型
     */
    private Integer accountType;
}
