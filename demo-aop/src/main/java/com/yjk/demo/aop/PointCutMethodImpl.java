package com.yjk.demo.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PointCutMethodImpl implements PointCutMethod{

    private static final Logger logger = LoggerFactory.getLogger(PointCutMethodImpl.class);

    @Override
    public String pointCutMethod(String s, String s1) {
        logger.info("方法执行中...");
        return s + s1;
    }
}
