package com.yjk.demo.reflection;

import org.springframework.util.ReflectionUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author yjk
 * @Description 反射工具类测试
 * @createTime 2023年03月13日 17:10:00
 */
public class ReflectionUtilsTest {

    public static void main(String[] args) {
        Field nameField = ReflectionUtils.findField(DemoEntity.class, "name");
        TestAnnotation annotation = nameField.getAnnotation(TestAnnotation.class);
        System.out.println(annotation.value());

        Method testMethod = ReflectionUtils.findMethod(TestServiceImpl.class, "testMethod", new Class[]{String.class});
        TestAnnotation methodAnnotation = testMethod.getAnnotation(TestAnnotation.class);
        System.out.println(methodAnnotation.value());
        try {
            TestService testService = new TestServiceImpl();
            Object result = testMethod.invoke(testService, "param");
            System.out.println("返回参数：" + result.toString());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        ReflectionUtils.doWithFields(DemoEntity.class, field -> {
            System.out.println(field.getName());
        });
        ReflectionUtils.doWithMethods(TestServiceImpl.class, method -> {
            System.out.println(method.getName());
        });
    }

}
