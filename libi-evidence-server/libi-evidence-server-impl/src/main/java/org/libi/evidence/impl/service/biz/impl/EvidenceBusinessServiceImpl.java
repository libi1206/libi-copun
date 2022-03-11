package org.libi.evidence.impl.service.biz.impl;

import org.libi.evidence.api.model.dto.EvidenceInfoDto;
import org.libi.evidence.impl.service.biz.EvidenceBusinessService;
import org.libi.evidence.impl.service.impl.EvidenceServiceImpl;
import org.libi.user.api.invoke.UserInvokeController;
import org.libi.user.api.model.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/12/22 12:00 AM
 */
@Service
public class EvidenceBusinessServiceImpl extends EvidenceServiceImpl implements EvidenceBusinessService {
    @Autowired
    private UserInvokeController userInvokeController;

    @Override
    public void doOnceEvidence(EvidenceInfoDto evidenceInfo) {
        UserInfoVO user = userInvokeController.getUserById("1");
    }
}
