package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderFacadeLoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeLoggingAspect.class);

    @After("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logProcessOrderInvocation(JoinPoint joinPoint) {
        LOGGER.info("Method {} was invoked.", joinPoint.getSignature().getName());
    }
}
