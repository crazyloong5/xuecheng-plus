package com.xuecheng.base.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @description 全局异常处理器
 * @version 1.0
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

   //自定义异常
   @ResponseBody
   @ExceptionHandler(XueChengPlusException.class)
   @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
   public RestErrorResponse customException(XueChengPlusException e) {
      log.error("【系统异常】{}",e.getErrMessage(),e);
      return new RestErrorResponse(e.getErrMessage());
   }

   //系统异常
   @ResponseBody
   @ExceptionHandler(Exception.class)
   @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
   public RestErrorResponse exception(Exception e) {

      log.error("【系统异常】{}",e.getMessage(),e);

      return new RestErrorResponse(CommonError.UNKOWN_ERROR.getErrMessage());

   }
}