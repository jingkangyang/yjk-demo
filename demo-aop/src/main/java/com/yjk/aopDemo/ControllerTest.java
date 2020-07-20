package com.yjk.aopDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerTest {

    @Autowired
    private PointCutMethod pointCutMethod;

    @GetMapping(value = "/test")
    public void test() {
        pointCutMethod.pointCutMethod();
    }
}
