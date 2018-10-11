package com.zb.fincore.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zb.fincore.facade.dto.AmsResp;
import com.zb.fincore.facade.model.FileInfoModel;
import com.zb.fincore.service.FileInfoService;

@RestController
public class FileInfoController {
	
	@Autowired
	private FileInfoService fileInfoService;
	
	@RequestMapping("/queryFileInfoList")
	public AmsResp<List<FileInfoModel>> queryFileInfoList() throws Exception{
		return fileInfoService.queryFileInfoList();
	}
	
}
