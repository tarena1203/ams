package com.zb.fincore.facade.base;

import java.io.Serializable;

/**
 * 请求对象
 */
public class BaseRequest implements Serializable {
	
	private static final long serialVersionUID = -5076393884569960111L;

	/* 渠道类型 */
    private String channelId;
    
    /* 未加密字段 */
    private String unsigned;
    
    /* 加密后字段 String类型 */
	private String signed;
	
    /* 服务项目：SIGN,VERIFY,ENCRYPT,DECRYPT */
	private String catalogType;
	
	/* 加密类型  */
    private String signType;

    //报文明文内容 
    private String xmlData;
    
    //报文加密内容 
    private String encData;
    
    //报文签名
    private String signData;
    
    //证书内容 
    private String certContent;
    
    //证书类型
    private String certType;
    
    //随机密钥
    private byte[] secretKey;
    
	public byte[] getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(byte[] secretKey) {
		this.secretKey = secretKey;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}

	/* 备用字段1 */
    private String attr1;
    
    /* 备用字段2 */
    private String attr2;
    
	public String getEncData() {
		return encData;
	}

	public void setEncData(String encData) {
		this.encData = encData;
	}

	public String getSignData() {
		return signData;
	}

	public void setSignData(String signData) {
		this.signData = signData;
	}

	public String getCertContent() {
		return certContent;
	}

	public void setCertContent(String certContent) {
		this.certContent = certContent;
	}

	public String getXmlData() {
		return xmlData;
	}

	public void setXmlData(String xmlData) {
		this.xmlData = xmlData;
	}

	/**
	 * @return the channelId
	 */
	public String getChannelId() {
		return channelId;
	}

	/**
	 * @param channelId the channelId to set
	 */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * @return the unsigned
	 */
	public String getUnsigned() {
		return unsigned;
	}

	/**
	 * @param unsigned the unsigned to set
	 */
	public void setUnsigned(String unsigned) {
		this.unsigned = unsigned;
	}

	/**
	 * @return the signed
	 */
	public String getSigned() {
		return signed;
	}

	/**
	 * @param signed the signed to set
	 */
	public void setSigned(String signed) {
		this.signed = signed;
	}

	/**
	 * @return the catalogType
	 */
	public String getCatalogType() {
		return catalogType;
	}

	/**
	 * @param catalogType the catalogType to set
	 */
	public void setCatalogType(String catalogType) {
		this.catalogType = catalogType;
	}

	/**
	 * @return the signType
	 */
	public String getSignType() {
		return signType;
	}

	/**
	 * @param signType the signType to set
	 */
	public void setSignType(String signType) {
		this.signType = signType;
	}

	/**
	 * @return the attr1
	 */
	public String getAttr1() {
		return attr1;
	}

	/**
	 * @param attr1 the attr1 to set
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}

	/**
	 * @return the attr2
	 */
	public String getAttr2() {
		return attr2;
	}

	/**
	 * @param attr2 the attr2 to set
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
    
    

}
