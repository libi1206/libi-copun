package org.libi.user.api.constant;

/**
 * @Author : libi
 * @Date : Created in 5:19 PM 2018/12/14
 */
public enum AuthStatus {
    UNAUTH(0, "未认证"),
    AUTHING(1, "认证中"),
    AUTH_SUCCESS(2, "认证成功"),
    AUTH_FAILURE(3, "认证失败");

    private int code;
    private String status;

    AuthStatus(int code, String status) {
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
    public static AuthStatus getStatusByCodeInt(int codeInt) {
        for (AuthStatus e : AuthStatus.values()) {
            if (e.getCode() == codeInt) {
                return e;
            }
        }
        throw new IllegalArgumentException("未定义的code码:" + codeInt);
    }
}
