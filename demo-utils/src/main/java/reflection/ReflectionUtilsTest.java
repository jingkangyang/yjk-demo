package reflection;

import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
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

        Method testMethod = ReflectionUtils.findMethod(TestService.class, "testMethod");

    }

}
