package org.libi.user.api.constant;

/**
 * @Author : libi
 * @Date : Created in 4:50 PM 2018/12/17
 */
public enum AuthType {
    NAKE(0, "未认证"),
    PERSON(1, "个人认证"),
    ORG(2, "企业认证"),
    UNKNOWN(-99, "未知");

    private int code;
    private String status;

    AuthType(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 根据code码获取枚举
     *
     * @param code
     * @return
     */
    public static AuthType getAuthTypeByCode(Integer code) {
        if (null == code) {
            return UNKNOWN;
        }
        AuthType[] values = AuthType.values();
        for (AuthType value : values) {
            if (value.getCode() == code.intValue()) {
                return value;
            }
        }
        return UNKNOWN;
    }

    public static AuthType getAuthTypeByStr(String str) {
        if (null == str) {
            return UNKNOWN;
        }
        switch (str) {
            case "PERSON":
                return AuthType.PERSON;
            case "ORG":
                return AuthType.ORG;
            case "NAKE":
                return AuthType.NAKE;
        }
        return UNKNOWN;
    }
    public static String getTypeByCodeInt(int codeInt) {
        for (AuthType e : AuthType.values()) {
            if (e.getCode() == codeInt) {
                return e.status;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + codeInt);
    }
}
