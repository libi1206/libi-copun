package org.libi.common.utils;

import org.libi.common.constant.Code;
import org.libi.common.exctption.BusinessException;

import java.util.Collection;

/**
 * @author wanghaifeng
 * @description 断言工具类
 * @date 2020/2/10
 */
public class AssertUtil {

    public static void check(boolean condition, Code code) {
        if (condition) {
            throw new BusinessException(code);
        }
    }

    public static void check(boolean condition, int code, String message) {
        if (condition) {
            throw new BusinessException(code, message);
        }
    }

    public static void check(boolean condition, String message) {
        if (condition) {
            throw new BusinessException(Code.ERROR.getCode(), message);
        }
    }


    public static void isNUll(Object object, Code code) {
        check(ObjectUtils.isEmpty(object), code);
    }

    public static void isNUll(Object object, String message) {
        check(ObjectUtils.isEmpty(object), message);
    }

    public static void isNotNUll(Object object, Code code) {
        check(!ObjectUtils.isEmpty(object), code);
    }

    public static void isCollectionNUll(Collection object, Code code) {
        check(ObjectUtils.isEmpty(object), code);
    }
}
