package reflection;

/**
 * @author yjk
 * @Description
 * @createTime 2023年03月13日 17:11:00
 */
public class DemoEntity {

    private Long id;

    @TestAnnotation(value = "注解属性")
    private String name;

}
