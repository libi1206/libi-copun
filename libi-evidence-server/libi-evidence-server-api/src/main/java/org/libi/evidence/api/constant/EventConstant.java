package org.libi.evidence.api.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author :Libi
 * @version :1.0
 * @date :3/12/22 10:14 PM
 * 消息队列传播的事件的类型
 */
@Getter
@AllArgsConstructor
public enum EventConstant {
    ONCE_EVIDENCE_END("onceEvidenceEnd-out-0", "一次性的存证结束"),
    ;
    private String channel;
    private String msg;

}
