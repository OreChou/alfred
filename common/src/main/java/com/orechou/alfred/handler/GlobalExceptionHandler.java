package com.orechou.alfred.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.orechou.alfred.pojo.Response;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理类
 * 从本质上，ControllerAdvice和RestControllerAdvice是切面注解。能够应用到所有被切到的Controller。而不能应用于404这种没有映射的url
 * 参考：http://www.importnew.com/27186.html
 *
 * @author OreChou
 * @create 2018-01-12 下午4:37
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public Response handleException(Exception e) {
        log.debug(e.getMessage());
        return Response.failure(e.getMessage());
    }

}
