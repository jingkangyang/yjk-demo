package com.yjk.demo.controller;

import com.yjk.demo.aop.PointCutMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aop")
public class AopControllerTest {

    @Autowired
    private PointCutMethod pointCutMethod;

    @GetMapping(value = "/test")
    public String test() {
        return pointCutMethod.pointCutMethod("123", "456");
    }
}
