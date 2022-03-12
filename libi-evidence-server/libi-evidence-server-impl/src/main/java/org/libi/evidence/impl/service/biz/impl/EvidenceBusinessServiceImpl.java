package org.libi.evidence.impl.service.biz.impl;

import org.libi.common.constant.Code;
import org.libi.common.exctption.BusinessException;
import org.libi.evidence.api.constant.EvidenceType;
import org.libi.evidence.api.model.dto.EvidenceInfoDto;
import org.libi.evidence.impl.entity.EvidenceDo;
import org.libi.evidence.impl.service.biz.EvidenceBusinessService;
import org.libi.evidence.impl.service.impl.EvidenceServiceImpl;
import org.libi.common.utils.NumUtil;
import org.libi.user.api.invoke.UserInvokeController;
import org.libi.user.api.model.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.Date;

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
    public String doOnceEvidence(EvidenceInfoDto evidenceInfo) {
        UserInfoVO user = userInvokeController.getUserById(evidenceInfo.getUserId());
        if (ObjectUtils.isEmpty(user)) {
            throw new BusinessException(Code.USER_NOT_EXIST);
        }
        EvidenceDo evidenceDo = new EvidenceDo();
        Date currentDate = new Date();
        evidenceDo.setEvidenceId(NumUtil.createEviNum(String.valueOf(EvidenceType.CONTENT.getCode()), currentDate.getTime(), "", ""));
        evidenceDo.setCreateTime(currentDate);
        evidenceDo.setUpdateTime(currentDate);
        evidenceDo.setName(evidenceDo.getName());
        evidenceDo.setType(EvidenceType.CONTENT.getCode());
        evidenceDo.setUserId(evidenceInfo.getUserId());
        insert(evidenceDo);
        return evidenceDo.getEvidenceId();
    }
}
