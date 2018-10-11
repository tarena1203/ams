package com.zb.fincore.service;

import java.util.List;

import com.zb.fincore.facade.dto.AmsResp;
import com.zb.fincore.facade.model.FileInfoModel;

public interface FileInfoService {
	
	/**
	 * 查询文件列表
	 * @return
	 * @throws Exception
	 */
	public AmsResp<List<FileInfoModel>> queryFileInfoList() throws Exception;
}
