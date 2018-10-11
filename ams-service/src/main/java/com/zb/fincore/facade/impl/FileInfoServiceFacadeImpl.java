package com.zb.fincore.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.fincore.facade.dto.AmsResp;
import com.zb.fincore.facade.model.FileInfoModel;
import com.zb.fincore.facade.service.FileInfoServiceFacade;
import com.zb.fincore.service.FileInfoService;

@Service
public class FileInfoServiceFacadeImpl implements FileInfoServiceFacade {

	@Autowired
	private FileInfoService fileInfoService;
	
	@Override
	public AmsResp<List<FileInfoModel>> queryFileInfoList() throws Exception {
		return fileInfoService.queryFileInfoList();
	}
	
}
