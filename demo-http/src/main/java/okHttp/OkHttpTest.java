package okHttp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yjk on 2020/11/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:spring/application.xml"})
@ContextConfiguration(classes = {OkHttpConfig.class, OkHttpUtil.class})
public class OkHttpTest {
    public static void main(String[] args){

    }

    @Test
    public void test(){
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        System.out.println("返回的报文内容为：");
        System.out.println((OkHttpUtil.getData("http://yangjingkang.51vip.biz:80/api",map)).getResponseBodyStr());
    }
}
