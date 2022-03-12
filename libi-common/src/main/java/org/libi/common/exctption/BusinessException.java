package org.libi.common.exctption;

import org.libi.common.constant.Code;

/**
 * Created by superlee on 2017/11/6.
 * 业务异常
 */
public class BusinessException extends BaseException {
    public BusinessException() {
    }

    public BusinessException(Code code) {
        super(code.getCode(), code.getMsg());
    }

    public BusinessException(int codeInt, String errorMsg) {
        super(codeInt, errorMsg);
    }

    public BusinessException(String errorMsg) {
        super(Code.ERROR.getCode(), errorMsg);
    }
}
