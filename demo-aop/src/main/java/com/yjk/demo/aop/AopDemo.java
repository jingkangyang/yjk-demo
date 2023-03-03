package com.yjk.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
public class AopDemo {

    private static final Logger logger = LoggerFactory.getLogger(AopDemo.class);

    @Pointcut("execution(* com.yjk.demo.aop.PointCutMethod.*(..))")
    private void methodTest() {
    }

    @Around("methodTest()")
    public String aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        List<String> argList = new ArrayList<>();
        for (Object arg : pjp.getArgs()) {
            argList.add(arg.toString());
        }
        logger.info("@Around方法前,入参:" + argList);
        // 方法执行
        Object proceed = pjp.proceed();
        logger.info("@Around方法后,返回参数:" + proceed);
        return proceed.toString();
    }

    @Before("methodTest()")
    public void beforeMethod() {
        logger.info("@Before方法前");
    }

    @After("methodTest()")
    public void afterMethod() {
        logger.info("@After方法后");
    }

}
