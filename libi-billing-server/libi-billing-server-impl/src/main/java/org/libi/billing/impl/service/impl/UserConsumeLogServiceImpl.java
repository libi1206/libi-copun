package org.libi.billing.impl.service.impl;

import org.libi.billing.api.model.param.ConsumeLogInsertParam;
import org.libi.billing.impl.dao.UserConsumeLogDao;
import org.libi.billing.impl.entity.UserConsumeLogDo;
import org.libi.billing.impl.service.UserConsumeLogService;
import org.libi.billing.impl.utils.BillNumUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :Libi
 * @version :1.0
 * @date :9/7/21 2:41 PM
 */
@Service
public class UserConsumeLogServiceImpl implements UserConsumeLogService {
    @Autowired
    private UserConsumeLogDao userConsumeLogDao;

    @Override
    public void insertConsumeLog(ConsumeLogInsertParam param) {
        String evidenceName = param.getEvidenceName();
        UserConsumeLogDo bean = new UserConsumeLogDo();
        bean.setUserId(param.getUserId());
        bean.setLogId(BillNumUtils.createBillId());
        bean.setEvidenceId(param.getEvidenceId());
        bean.setEvidenceName(evidenceName);
        bean.setEvidenceType(param.getEvidenceType());
        bean.setCost(param.getCost());
        bean.setAccountType(param.getAccountType());
        bean.setDuration(param.getDuration());
        userConsumeLogDao.insert(bean);
    }
}
