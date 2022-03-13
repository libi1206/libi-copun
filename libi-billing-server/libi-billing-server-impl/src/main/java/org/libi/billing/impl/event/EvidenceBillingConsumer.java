package org.libi.billing.impl.event;

import lombok.extern.slf4j.Slf4j;
import org.libi.evidence.api.model.message.EvidenceEndMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.function.Consumer;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/13/22 12:21 AM
 */
@Service
@Slf4j
public class EvidenceBillingConsumer {
    @Bean
    public Consumer<EvidenceEndMessage> onceEvidenceEnd() {
        return message -> {
            log.info("收到消息：{}", message);
        };
    }

}
