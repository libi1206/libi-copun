package org.libi.billing.api.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.libi.evidence.api.constant.EvidenceType;

/**
 * @author :Libi
 * @version :1.0
 * @date :11/22/21 3:52 PM
 * 消费类型
 */
@AllArgsConstructor
@Getter
public enum ConsumeType {
    //========== 兼容之前直接使用存取证类型当消费类型的情况 ==================
    FILE(0, "文件存证", RefType.EVIDENCE_RECORD, EvidenceType.FILE),
    CONTENT(1, "内容存证", RefType.EVIDENCE_RECORD,EvidenceType.CONTENT),
    WEB(2, "网页取证", RefType.FORENSICS_RECORD,EvidenceType.WEB),
    PROCESS(3, "过程取证", RefType.FORENSICS_RECORD,EvidenceType.PROCESS),
    CALLING(5, "通话取证", RefType.FORENSICS_RECORD,EvidenceType.CALLING),
    AUTO_PLAY(4, "自动取证", RefType.FORENSICS_RECORD,EvidenceType.AUTO_PLAY),
    SOUND(-1, "录音取证", RefType.FORENSICS_RECORD,EvidenceType.SOUND),
    VIDEO(-2, "录像取证", RefType.FORENSICS_RECORD,EvidenceType.VIDEO),
    PHOTO(-3, "拍照取证", RefType.FORENSICS_RECORD,EvidenceType.PHOTO),
    SCREEN_VIDEO(-4, "录屏取证", RefType.FORENSICS_RECORD,EvidenceType.SCREEN_VIDEO),
    SCREEN_PHOTO(-5, "截屏存证", RefType.FORENSICS_RECORD,EvidenceType.SCREEN_PHOTO),
    EVIDENCE(6, "存证", RefType.EVIDENCE_RECORD,EvidenceType.EVIDENCE),
    FORENSICS(7, "取证", RefType.FORENSICS_RECORD,EvidenceType.FORENSICS),
    APP_EVI(8, "应用存证", RefType.OPEN_EVIDENCE_RECORD,EvidenceType.APP_EVI),
    PROPERTY(9, "版权存证", RefType.EVIDENCE_RECORD,EvidenceType.PROPERTY),
    //============ 之后出现的，可能会有非存取证的消费场景 ================
    PROPERTY_STANDARD(10, "版权存证-标准版权服务包", RefType.EVIDENCE_RECORD,EvidenceType.PROPERTY),
    PROPERTY_AUTHORITATIVE(11, "版权存证-权威版权服务包", RefType.EVIDENCE_RECORD,EvidenceType.PROPERTY),
    AUTHORITATIVE_CONFIRMATION(12, "权威版权服务包", RefType.EVIDENCE_CONFIRMATION_RECORD, null),
    // 退款功能
    ORDER_REFUND(13,"套餐退款",RefType.ORDER_REFUND_RECORD,null);
    ;

    private int code;
    private String msg;
    /**
     * 这种消费类型在用户流水表 user_account_log 中对应的是哪一种引用id
     */
    private RefType refType;

    /**
     * 消费类型对应的存证类型，没有对应的类型则为null
     */
    private EvidenceType evidenceType;

    public static ConsumeType getEnumByCode(int code) {
        ConsumeType[] values = ConsumeType.values();
        for (ConsumeType fileType : values) {
            if (fileType.getCode() == code) {
                return fileType;
            }
        }
        throw new IllegalArgumentException("未定义的消费类型:" + code);
    }

    public static ConsumeType getEnumByEvidenceType(EvidenceType evidenceType) {
        ConsumeType[] values = ConsumeType.values();
        for (ConsumeType fileType : values) {
            if (evidenceType.equals(fileType.evidenceType)) {
                return fileType;
            }
        }
        throw new IllegalArgumentException("没有对应的消费类型");
    }
}
