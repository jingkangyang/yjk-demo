package com.yjk.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopControllerTest {

    @Autowired
    private PointCutMethod pointCutMethod;

    @GetMapping(value = "/testAop")
    public String test() {
        return pointCutMethod.pointCutMethod("123", "456");
    }
}
