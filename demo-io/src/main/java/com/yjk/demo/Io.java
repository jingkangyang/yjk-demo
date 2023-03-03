package com.yjk.demo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class Io {

    private final static Logger logger = LoggerFactory.getLogger(Io.class);

    @Test
    public void test1() throws IOException {
        int bytesum = 0;
        int byteread = 0;
        String pathUrl = "https://certify-test.oss-cn-hangzhou.aliyuncs.com/006685e8-48d3-4362-a6b6-0e53a35fc59e_1570628972464_idcardimg?Expires=1581064577&OSSAccessKeyId=LTAIqeT6WbHgyoJ1&Signature=GeE5sAq9YFOkzcUGBFzLytCHZ8I%3D&down_user=%E6%B9%96%E5%8C%97%E6%B6%88%E8%B4%B9%E9%87%91%E8%9E%8D%E8%82%A1%E4%BB%BD%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8%28%E5%A4%A7%E9%A2%9D%29";

        byte[] b = sendGet(pathUrl);

        String tempPath = "C:"+File.separator+"123.jpg";
        File file = new File(tempPath);

        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(b);
            fos.flush();
        }


    }

    public byte[] sendGet(String httpUrl) {
        HttpURLConnection connection = null;
        InputStream is = null;
        OutputStream os = null;
        BufferedReader br = null;
        try {
            URL url = new URL(httpUrl);
            // 通过远程url连接对象打开连接
            connection = (HttpURLConnection) url.openConnection();
            // 设置连接请求方式
            connection.setRequestMethod("GET");
            // 设置连接主机服务器超时时间：30000毫秒
            connection.setConnectTimeout(Integer.parseInt("30000"));
            // 设置读取主机服务器返回数据超时时间：60000毫秒
            connection.setReadTimeout(Integer.parseInt("60000"));
            // 默认值为：false，当向远程服务器传送数据/写数据时，需要设置为true
            connection.setDoOutput(true);
            // 默认值为：true，当前向远程服务读取数据时，设置为true，该参数可有可无
            connection.setDoInput(true);
            // 设置传入参数的格式:请求参数应该是 name1=value1&name2=value2 的形式。
            /*connection.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded");*/
            // 设置鉴权信息：Authorization: Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0
            //connection.setRequestProperty("Authorization","Bearer da3efcbf-0845-4fe3-8aba-ee040be542c0");
            //logger.info("Http Url:["+httpUrl+"]");
            //logger.info("Http Param:["+param+"]");
            // 通过连接对象获取一个输出流
            //os = connection.getOutputStream();
            // 通过输出流对象将参数写出去/传输出去,它是通过字节数组写出的
            //os.write(param.getBytes());
            // 通过连接对象获取一个输入流，向远程读取
                logger.info("1");
                is = connection.getInputStream();
                logger.info("2");
                byte[] b = new byte[is.available()];
                logger.info("3");
                is.read(b);
                logger.info("4");
                return b;
                // 对输入流对象进行包装:charset根据工作项目组的要求来设置
                /*br = new BufferedReader(new InputStreamReader(is, charSet));
                StringBuffer sbf = new StringBuffer();
                String temp = null;
                // 循环遍历一行一行读取数据
                while ((temp = br.readLine()) != null) {
                    sbf.append(temp);
                    sbf.append("\r\n");
                }
                result = sbf.toString();*/
        } catch (Exception e) {
            throw new RuntimeException("get请求异常",e);
        } finally {
            // 关闭资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    logger.error(e.getMessage(),e);
                }
            }
            if (null != os) {
                try {
                    os.close();
                } catch (IOException e) {
                    logger.error(e.getMessage(),e);
                }
            }
            if (null != is) {
                try {
                    is.close();
                } catch (IOException e) {
                    logger.error(e.getMessage(),e);
                }
            }
            // 断开与远程地址url的连接
            connection.disconnect();
        }
    }

}
