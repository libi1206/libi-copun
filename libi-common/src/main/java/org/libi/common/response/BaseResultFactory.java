package org.libi.common.response;


import org.libi.common.constant.Code;

/**
 * Created by superlee on 2017/11/7.
 * baseResult工程方法
 */
@SuppressWarnings("unchecked")
public final class BaseResultFactory {


    public static BaseResult produceEmptyResult(Code code) {
        return new BaseResult(code);
    }

    public static BaseResult produceEmptyResult(int codeInt, String msg) {
        return new BaseResult(codeInt, msg);
    }

    public static <T> BaseResult<T> produceResult(int codeInt, String msg, T data) {
        return new BaseResult(codeInt, msg, data);
    }

    public static <T> BaseResult<T> produceResult(Code code, T data) {
        return new BaseResult(code.getCode(), code.getMsg(), data);
    }
    /**
     * 创建成功的result
     * @return
     */
    public static BaseResult produceSuccessResult(){
        return new BaseResult(Code.SUCCESS);
    }

    /**
     * 创建成功有返回的result
     * @return
     */
    public static <T> BaseResult<T> produceSuccessResult(T data){
        return new BaseResult(Code.SUCCESS, data);
    }


}
