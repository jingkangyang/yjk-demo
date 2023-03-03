package com.yjk.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
public class AopDemo {

    @Pointcut("execution(* com.yjk.demo.PointCutMethod.*(..))")
    private void methodTest() {
    }

    @Around("methodTest()")
    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        List<String> argList = new ArrayList<>();
        for (Object arg : pjp.getArgs()) {
            argList.add(arg.toString());
        }
        System.out.println("@Around方法前,入参:" + argList);
        // 方法执行
        Object proceed = pjp.proceed();
        System.out.println("@Around方法后,返回参数:" + proceed);
    }

    @Before("methodTest()")
    public void beforeMethod() {
        System.out.println("@Before方法前");
    }

    @After("methodTest()")
    public void afterMethod() {
        System.out.println("@After方法后");
    }

}
