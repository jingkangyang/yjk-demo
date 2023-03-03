package com.yjk.demo.okHttp;

import com.alibaba.fastjson.JSON;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by yjk on 2020/11/5.
 */
@Component
public class OkHttpUtil {

    private static final Logger logger = LoggerFactory.getLogger(OkHttpUtil.class);

    @Autowired
    private OkHttpClient okHttpClient;

    private static OkHttpUtil okHttpUtil;

    private static final String APPLOCATION_JSON_UTF8="application/json; charset=utf-8";
    private static final String APPLOCATION_XML_UTF8="application/xml; charset=utf-8";
    private static final String APPLOCATION_XML_GBK="application/xml; charset=GBK";
    private static final String APPLOCATION_FORM_UTF8="application/x-www-form-urlencoded";

    @PostConstruct
    public void initClient() {
        logger.info("初始化okHttpClient。。。");
        okHttpUtil = this;
        okHttpUtil.okHttpClient = this.okHttpClient;
    }

    /**
     * 根据map获取get请求参数
     * @param queries
     * @return
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static StringBuffer getQueryString(String url,Map<String,String> queries){
        StringBuffer sb = new StringBuffer(url);
        if (queries != null && queries.keySet().size() > 0) {
            boolean firstFlag = true;
            Iterator iterator = queries.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry entry = (Map.Entry<String, String>) iterator.next();
                if (firstFlag) {
                    sb.append("?" + entry.getKey() + "=" + entry.getValue());
                    firstFlag = false;
                } else {
                    sb.append("&" + entry.getKey() + "=" + entry.getValue());
                }
            }
        }
        return sb;
    }

    /**
     * 调用okhttp的newCall方法
     * @param request
     * @return com.yjk.demo.okHttp.OkHttpResponseDto
     */
    private static OkHttpResponseDto execNewCall(Request request){
        Response response = null;
        OkHttpResponseDto okHttpResponse = new OkHttpResponseDto();
        okHttpResponse.setResponseBodyStr("");
        try {
            response = okHttpUtil.okHttpClient.newCall(request).execute();
            logger.info("okhttp3 返回报文:{}", JSON.toJSONString(response));
            okHttpResponse.setHttpStatusCode(response.code());
            okHttpResponse.setExecSuccess(true);
            if (response.isSuccessful()) {
                //网络请求成功
                okHttpResponse.setResponseBodyStr(response.body().string());
            }else {
                //网络请求异常
                if(response != null && response.body() != null) {
                    logger.info("okhttp3 返回异常报文:{}",response.body().string());
                }
            }
        } catch (Exception e) {
            //发送网络请求异常
            okHttpResponse.setExecSuccess(false);
            e.printStackTrace();
            logger.error("okhttp3 put error >> ex = {}", e.getMessage());
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return okHttpResponse;
    }

    /**
     * 发送get请求
     * @param url     请求的url
     * @param queries 请求的参数，在浏览器？后面的数据，没有可以传null
     * @return Response Body字符串
     */
    public static String get(String url, Map<String, String> queries) {
        StringBuffer sb = getQueryString(url,queries);
        Request request = new Request.Builder()
                .url(sb.toString())
                .build();
        return execNewCall(request).getResponseBodyStr();
    }
    /**
     * 发送get请求
     * @param url     请求的url
     * @param queries 请求的参数，在浏览器？后面的数据，没有可以传null
     * @return com.yjk.demo.okHttp.OkHttpResponseDto
     */
    public static OkHttpResponseDto getData(String url, Map<String, String> queries) {
        StringBuffer sb = getQueryString(url,queries);
        Request request = new Request.Builder()
                .url(sb.toString())
                .build();
        return execNewCall(request);
    }

    /**
     * 发送post请求-form表单格式
     * @param url    请求的url
     * @param params post form 提交的参数
     * @return Response Body字符串
     */
    public static String postFormParams(String url, Map<String, String> params) {
        FormBody.Builder builder = new FormBody.Builder();
        //添加参数
        if (params != null && params.keySet().size() > 0) {
            for (String key : params.keySet()) {
                builder.add(key, params.get(key));
            }
        }
        Request request = new Request.Builder()
                .url(url)
                .post(builder.build())
                .build();
        return execNewCall(request).getResponseBodyStr();
    }
    /**
     * post请求发送form表单格式数据
     * @param url    请求的url
     * @param params post form 提交的参数
     * @return com.yjk.demo.okHttp.OkHttpResponseDto
     */
    public static OkHttpResponseDto postFormParamsDate(String url, Map<String, String> params) {
        FormBody.Builder builder = new FormBody.Builder();
        //添加参数
        if (params != null && params.keySet().size() > 0) {
            for (String key : params.keySet()) {
                builder.add(key, params.get(key));
            }
        }
        Request request = new Request.Builder()
                .url(url)
                .post(builder.build())
                .build();
        return execNewCall(request);
    }


    /**
     * Post请求发送JSON数据....{"name":"zhangsan","pwd":"123456"}
     * 参数一：请求Url
     * 参数二：请求的JSON
     * 返回：Response Body字符串
     */
    public static String postJsonParams(String url, String jsonParams) {
        return postParamStr(url,jsonParams,APPLOCATION_JSON_UTF8);
    }
    /**
     * Post请求发送JSON数据....{"name":"zhangsan","pwd":"123456"}
     * 参数一：请求Url
     * 参数二：请求的JSON
     * 返回：com.yjk.demo.okHttp.OkHttpResponseDto
     */
    public static OkHttpResponseDto postJsonParamsDate(String url, String jsonParams) {
        return postParam(url,jsonParams,APPLOCATION_JSON_UTF8);
    }

    /**
     * Post请求发送xml数据,编码utf8
     * 参数一：请求Url
     * 参数二：请求的xmlString
     * 返回：Response Body字符串
     */
    public static String postXmlParams(String url, String xml) {
        return postParamStr(url,xml,APPLOCATION_XML_UTF8);
    }

    /**
     * Post请求发送xml数据,编码utf8
     * 参数一：请求Url
     * 参数二：请求的xmlString
     * 返回：com.yjk.demo.okHttp.OkHttpResponseDto
     */
    public static OkHttpResponseDto postXmlParamsData(String url, String xml) {
        return postParam(url,xml,APPLOCATION_XML_UTF8);
    }

    /**
     * Post请求发送xml数据，编码utf8
     * 参数一：请求Url
     * 参数二：请求的xmlString
     * 返回：Response Body字符串
     */
    public static String postXmlParamsGBK(String url, String xml) {
        return postParamStr(url,xml,APPLOCATION_XML_GBK);
    }
    /**
     * Post请求发送xml数据，编码utf8
     * 参数一：请求Url
     * 参数二：请求的xmlString
     * 返回：com.yjk.demo.okHttp.OkHttpResponseDto
     */
    public static OkHttpResponseDto postXmlParamsGBKData(String url, String xml) {
        return postParam(url,xml,APPLOCATION_XML_GBK);
    }

    /**
     * Post请求发送Form数据，编码UTF8
     * 参数一：请求Url
     * 参数二：请求的xmlString
     * 返回：Response Body字符串
     */
    public static String postFormParams(String url, String xml) {
        return postParamStr(url,xml,APPLOCATION_FORM_UTF8);
    }


    /**
     * Post请求发送xml数据....
     * @param url 请求Url
     * @param content 发送内容
     * @param mediaTypeString  RequestBody的编码格式
     * @return com.yjk.demo.okHttp.OkHttpResponseDto
     */
    public static OkHttpResponseDto postParam(String url, String content,String mediaTypeString) {
        RequestBody requestBody = RequestBody.create(MediaType.parse(mediaTypeString), content);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        return execNewCall(request);
    }
    /**
     * Post请求发送xml数据....
     * @param url 请求Url
     * @param content 发送内容
     * @param mediaTypeString  RequestBody的编码格式
     * @return Response Body字符串
     */
    public static String postParamStr(String url, String content,String mediaTypeString) {
        RequestBody requestBody = RequestBody.create(MediaType.parse(mediaTypeString), content);
        Request request = new Request.Builder()
                .url(url)
                .post(requestBody)
                .build();
        return execNewCall(request).getResponseBodyStr();
    }

}

