package com.yjk.aopDemo;

import org.springframework.stereotype.Component;

@Component
public class PointCutMethodImpl implements PointCutMethod{
    @Override
    public void pointCutMethod() {
        System.out.println("方法执行中。。。");
    }
}
