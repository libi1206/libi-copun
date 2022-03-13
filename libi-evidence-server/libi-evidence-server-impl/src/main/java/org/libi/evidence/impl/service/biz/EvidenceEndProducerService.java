package org.libi.evidence.impl.service.biz;

import org.libi.evidence.api.model.message.EvidenceEndMessage;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/12/22 10:10 PM
 */
public interface EvidenceEndProducerService {
    void sendOnceEvidence(EvidenceEndMessage message);
}
