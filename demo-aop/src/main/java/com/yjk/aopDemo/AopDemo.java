package com.yjk.aopDemo;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AopDemo {

    @Pointcut("execution(* com.yjk.aopDemo.PointCutMethodImpl.*(..))")
    private void methodTest() {
    }

    @Before("methodTest()")
    public void beforeMethod() {
        System.out.println("方法前执行。。。");
    }

    @After("methodTest()")
    public void afterMethod() {
        System.out.println("方法后执行。。。");
    }

}
