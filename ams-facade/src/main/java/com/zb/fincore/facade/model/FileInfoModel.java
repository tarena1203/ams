package com.zb.fincore.facade.model;

import java.io.Serializable;

public class FileInfoModel implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1023555963572645291L;

	/**
	 * 主键
	 */
	private Long id;
	    
	/**
	 * 文件名
	 */
	private String fileName;

	/**
	 * 文件类型
	 */
	private String fileType;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}
	
}
