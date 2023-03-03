package com.yjk.demo.okHttp;

import java.io.Serializable;
/**
 * OKhttp请求返回封装类
 * @author wangshuang
 * @date 2020.09.17 16:16
 */
public class OkHttpResponseDto implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 是否执行成功
	 */
	private boolean execSuccess;
	/**
	 * http状态码
	 */
	private int httpStatusCode;
	
	/**
	 * 返回报文
	 */
	private String responseBodyStr;


	public String getResponseBodyStr() {
		return responseBodyStr;
	}

	public void setResponseBodyStr(String responseBodyStr) {
		this.responseBodyStr = responseBodyStr;
	}

	public boolean isExecSuccess() {
		return execSuccess;
	}

	public void setExecSuccess(boolean execSuccess) {
		this.execSuccess = execSuccess;
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}
	
}
