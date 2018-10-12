package com.zb.fincore.facade.base;

import com.zb.fincore.facade.enums.RespEnum;

import java.io.Serializable;

/**
 *  响应对象
 * @author lijun
 * @param <T>
 */
public class BaseResponse<T> implements Serializable {
	private String rspCode = RespEnum.REQ_CODE_SUCC.getRspCode();
	private String rspMsg = RespEnum.REQ_CODE_SUCC.getRspMsg();
	private T data;

	public BaseResponse() {
	}

	public BaseResponse(String rspCode, String rspMsg) {
		this.rspCode = rspCode;
		this.rspMsg = rspMsg;
	}

	public String getRspCode() {
		return rspCode;
	}

	public void setRspCode(String rspCode) {
		this.rspCode = rspCode;
	}

	public String getRspMsg() {
		return rspMsg;
	}

	public void setRspMsg(String rspMsg) {
		this.rspMsg = rspMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
