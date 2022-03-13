package org.libi.billing.impl.service;

import org.libi.billing.api.model.param.ConsumeLogInsertParam;

/**
 * @author :Libi
 * @version :1.0
 * @date :9/7/21 2:40 PM
 */
public interface UserConsumeLogService {
    /**
     * 插入消费记录
     *
     * @param param
     */
    void insertConsumeLog(ConsumeLogInsertParam param);
}
