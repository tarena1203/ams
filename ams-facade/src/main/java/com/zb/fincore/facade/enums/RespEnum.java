package com.zb.fincore.facade.enums;

public enum RespEnum {
	
	REQ_CODE_SUCC("0000","请求成功"),
	REQ_CODE_FAIL("9999","请求失败");
	
	//支付状态
	public static final String PAY_STATUS_U = "U";//初始化
	public static final String PAY_STATUS_P = "P";//处理中
	public static final String PAY_STATUS_S = "S";//成功
	public static final String PAY_STATUS_F = "F";//失败

	/**
	 * 返回码
	 */
	private String rspCode;
	
	/**
	 * 返回信息
	 */
	private String rspMsg;
	
	private RespEnum(String rspCode, String rspMsg){
		this.rspCode=rspCode;
		this.rspMsg=rspMsg;
	}
	
	/**
	 * @return the rspCode
	 */
	public String getRspCode() {
		return rspCode;
	}

	/**
	 * @param rspCode the rspCode to set
	 */
	public void setRspCode(String rspCode) {
		this.rspCode = rspCode;
	}

	/**
	 * @return the rspMsg
	 */
	public String getRspMsg() {
		return rspMsg;
	}

	/**
	 * @param rspMsg the rspMsg to set
	 */
	public void setRspMsg(String rspMsg) {
		this.rspMsg = rspMsg;
	}
	
	public static RespEnum valueByRspCode(String rspCode){
		for(RespEnum constants: RespEnum.values()){
			if(constants.getRspCode().equals(rspCode)){
				return constants;
			}
		}
		
		return null;
		
	}

}