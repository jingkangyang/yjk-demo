import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMain {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------方法注解测试----------");
        Class clazz = TestClass.class;
        Object obj = clazz.newInstance();
        //Method method = clazz.getMethod("testMethod");
        Method[] methods = clazz.getMethods();
        for (Method method:methods) {
            if (method.isAnnotationPresent(AnnotionMethodDemo.class)) {
                AnnotionMethodDemo annotionDemo = method.getAnnotation(AnnotionMethodDemo.class);
                System.out.println(annotionDemo.param());
                method.invoke(obj);
            }
        }

        System.out.println("---------------字段注解测试----------");
        TestDtoClass dto = new TestDtoClass();
        dto.setA("a");
        dto.setB("b");
        dto.setC("c");
        getField(dto);
    }

    public static void getField(Object obj) throws Exception {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field: fields) {
            field.setAccessible(true);
            String key = field.getName();
            Object value = field.get(obj);
            if (field.isAnnotationPresent(AnnotionFieldDemo.class)) {
                AnnotionFieldDemo annotionFieldDemo = field.getAnnotation(AnnotionFieldDemo.class);
                System.out.println(annotionFieldDemo.param());
            }
        }
    }

}
