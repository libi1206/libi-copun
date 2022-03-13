package org.libi.evidence.impl.service.biz.impl;

import lombok.extern.slf4j.Slf4j;
import org.libi.evidence.api.constant.EventConstant;
import org.libi.evidence.api.model.message.EvidenceEndMessage;
import org.libi.evidence.impl.service.biz.EvidenceEndProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/12/22 10:11 PM
 */
@Service
@Slf4j
public class EvidenceEndProducerServiceImpl implements EvidenceEndProducerService {
    @Autowired
    private StreamBridge bridge;

    @Override
    public void sendOnceEvidence(EvidenceEndMessage message) {
        log.info("send: {}", message);
        bridge.send(EventConstant.ONCE_EVIDENCE_END.getChannel(), message);
    }
}
