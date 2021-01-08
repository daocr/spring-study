package com.huilong.chapter1.advice;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知
 *
 * @author daocr
 * @date 2021/1/8
 */
@Slf4j
public class MyAroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("环绕通知");
        return invocation.proceed();
    }
}
