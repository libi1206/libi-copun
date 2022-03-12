package org.libi.evidence.api.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author : linouya
 * @date : Created in 3:00 PM 2018/12/21
 * added by libi 2019/6/10
 * 用于辨识存证的类型
 */
@AllArgsConstructor
@Getter
public enum EvidenceType {

    FILE(0, "文件存证"),
    CONTENT(1, "内容存证"),
    WEB(2, "网页取证"),
    PROCESS(3, "过程取证"),
    CALLING(5, "通话取证", "通话文件_%s.wav", "thqz%s.zip"),
    AUTO_PLAY(4, "自动取证"),

    SOUND(-1, "录音取证", "录音文件_%s.mp3", "lyqz%s.zip"),
    VIDEO(-2, "录像取证", "录像文件_%s.mp4", "lxqz%s.zip"),
    PHOTO(-3, "拍照取证", "拍照文件_%s.jpg", "pzqz%s.zip"),
    SCREEN_VIDEO(-4, "录屏取证", "录屏文件_%s.mp4", "lpqz%s.zip"),
    SCREEN_PHOTO(-5, "截屏存证"),

    EVIDENCE(6, "存证"),
    FORENSICS(7, "取证"),
    APP_EVI(8, "应用存证"),
    PROPERTY(9, "版权存证");

    private int code;
    private String msg;
    /**
     * 录制name
     */
    private String recordFileName;
    /**
     * 压缩包name
     */
    private String pkgName;

    EvidenceType(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    EvidenceType(int code, String msg, String recordFileName) {
        this.code = code;
        this.msg = msg;
        this.recordFileName = recordFileName;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public static String getMsgByCodeInt(int codeInt) {
        for (EvidenceType e : EvidenceType.values()) {
            if (e.getCode() == codeInt) {
                return e.msg;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + codeInt);
    }

    public static String getRecordFileNameByCodeInt(int codeInt) {
        for (EvidenceType e : EvidenceType.values()) {
            if (e.getCode() == codeInt) {
                return e.recordFileName;
            }
        }
        throw new IllegalArgumentException("未定义的recordFileName:" + codeInt);
    }

    public static String getPkgNameByCodeInt(int codeInt) {
        for (EvidenceType e : EvidenceType.values()) {
            if (e.getCode() == codeInt) {
                return e.pkgName;
            }
        }
        throw new IllegalArgumentException("未定义的pkgName:" + codeInt);
    }

    public static EvidenceType getEnumByCode(int code) {
        EvidenceType[] values = EvidenceType.values();
        for (EvidenceType fileType : values) {
            if (fileType.getCode() == code) {
                return fileType;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + code);
    }

    public EvidenceType getFirstType() {
        if (code == EvidenceType.WEB.code
                || code == EvidenceType.PROCESS.code
                || code == EvidenceType.AUTO_PLAY.code
                || code == EvidenceType.PHOTO.code
                || code == EvidenceType.VIDEO.code
                || code == EvidenceType.SOUND.code
                || code == EvidenceType.SCREEN_VIDEO.code
                || code == EvidenceType.FORENSICS.code
                || code == EvidenceType.CALLING.code
        ) {
            return EvidenceType.FORENSICS;
        }
        return EvidenceType.EVIDENCE;
    }

    public String getPkgFolderName() {
        String pkgName = this.getPkgName();
        return pkgName.substring(0,pkgName.lastIndexOf("."));
    }
}
