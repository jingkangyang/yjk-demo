package reflection;

/**
 * @author yjk
 * @Description
 * @createTime 2023年03月13日 17:26:00
 */
public class TestServiceImpl implements TestService{
    @Override
    @TestAnnotation(value = "方法注解属性")
    public String testMethod(String s) {
        System.out.println("方法执行。。。");
        return s;
    }
}
