package com.yjk.demo;

import org.springframework.stereotype.Component;

@Component
public class PointCutMethodImpl implements PointCutMethod{
    @Override
    public String pointCutMethod(String s, String s1) {
        System.out.println("方法执行中...");
        return s + s1;
    }
}
