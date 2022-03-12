package org.libi.evidence.impl.exception;

import lombok.extern.slf4j.Slf4j;
import org.libi.common.constant.Code;
import org.libi.common.exctption.BusinessException;
import org.libi.common.response.BaseResult;
import org.libi.common.response.BaseResultFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.multipart.support.MissingServletRequestPartException;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

/**
 * @author superlee
 * @date 2017/11/6
 * 全局异常处理
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandlerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public BaseResult handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        BindingResult result = e.getBindingResult();
        List<ObjectError> allErrors = result.getAllErrors();
        StringBuilder message = new StringBuilder();
        for (ObjectError error : allErrors) {
            message.append(error.getDefaultMessage()).append("; ");
        }
        e.printStackTrace();
        log.error("出现参数非法异常：msg: {}", message.toString());
        return new BaseResult(Code.PARAMETER_ERROR.getCode(), message.toString());
    }

    @ExceptionHandler(BusinessException.class)
    @ResponseBody
    public BaseResult handleBusinessException(BusinessException be) {
        log.error(be.getMsg());
        be.printStackTrace();
        return BaseResultFactory.produceEmptyResult(be.getCodeInt(), be.getMessage());
    }

    @ExceptionHandler({HttpMessageNotReadableException.class, HttpMediaTypeNotSupportedException.class})
    @ResponseBody
    public BaseResult handlerHttpMessageNotReadableException(Exception e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return new BaseResult(Code.PARAMETER_ERROR);
    }

    @ExceptionHandler(MissingServletRequestPartException.class)
    @ResponseBody
    public BaseResult handlerMissingServletRequestPartException(MissingServletRequestPartException e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return new BaseResult(Code.PARAMETER_ERROR.getCode(), e.getRequestPartName() + "不能为空");
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseBody
    public BaseResult handlerMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return new BaseResult(Code.PARAMETER_ERROR.getCode(), e.getParameterName() + "不能为空");
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    @ResponseBody
    public BaseResult handlerMaxUploadSizeExceededException(MaxUploadSizeExceededException e) {
        log.error(e.getMessage());
        e.printStackTrace();
        return new BaseResult(Code.PARAMETER_ERROR.getCode(), "文件大小超出限制");
    }


    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public BaseResult handleConConstraintViolationException(ConstraintViolationException e) {
        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        StringBuilder message = new StringBuilder();
        for (ConstraintViolation cv :
                constraintViolations) {
            message.append(cv.getMessage()).append("; ");
        }
        return new BaseResult(Code.PARAMETER_ERROR.getCode(), message.toString());
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public BaseResult handlerBindException(BindException e) {
        log.error("ERROR{}", e);
        String defaultMessage = e.getBindingResult().getFieldErrors().get(0).getDefaultMessage();
        return new BaseResult(Code.PARAMETER_ERROR.getCode(), defaultMessage);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResult handleDefaultException(Exception be) {
        log.error(be.getMessage());
        be.printStackTrace();
        if (be instanceof SQLException) {
            return new BaseResult(Code.REQUEST_TOO_OFTEN_RETRY);
        }
        return new BaseResult(Code.UNKNOWN_ABNORMAL);
    }
}