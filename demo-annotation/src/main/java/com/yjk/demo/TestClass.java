package com.yjk.demo;

public class TestClass {
    @AnnotionMethodDemo(param = "测试属性值A")
    public void testMethod(){
        System.out.println("我是方法A");
    }

    @AnnotionMethodDemo(param = "测试属性值B")
    public void testMethodB() {
        System.out.println("我是方法B");
    }
}
