package org.libi.evidence.api.model.message;

import lombok.*;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/12/22 10:07 PM
 * 存证完成后的广播消息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class EvidenceEndMessage<T> {
    private String evidenceId;
    private String userId;
    private T data;
}
