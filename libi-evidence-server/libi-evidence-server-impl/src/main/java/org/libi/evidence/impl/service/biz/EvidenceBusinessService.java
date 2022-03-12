package org.libi.evidence.impl.service.biz;

import org.libi.evidence.api.model.dto.EvidenceInfoDto;
import org.libi.evidence.impl.service.EvidenceService;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/11/22 11:48 PM
 */
public interface EvidenceBusinessService extends EvidenceService {

    /**
     * 一次就可以返回的存证逻辑
     * @param evidenceInfo
     * @return 存证id
     */
    String doOnceEvidence(EvidenceInfoDto evidenceInfo);
}
