package com.zb.fincore.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zb.fincore.dao.FileInfoDao;
import com.zb.fincore.facade.dto.AmsResp;
import com.zb.fincore.facade.model.FileInfoModel;
import com.zb.fincore.model.FileInfo;
import com.zb.fincore.service.FileInfoService;

@Service
public class FileInfoServiceImpl implements FileInfoService {
	
	@Autowired
	private FileInfoDao fileInfoDao;
	
	@Override
	public AmsResp<List<FileInfoModel>> queryFileInfoList() throws Exception {
		AmsResp<List<FileInfoModel>> resp = new AmsResp<List<FileInfoModel>>();
		List<FileInfoModel> modelList = new ArrayList<FileInfoModel>();
		List<FileInfo> fileList = fileInfoDao.queryFileInfoList();
		for(FileInfo fileInfo : fileList){
			FileInfoModel model = new FileInfoModel();
			BeanUtils.copyProperties(fileInfo, model);
			modelList.add(model);
		}
		resp.setData(modelList);
		return resp;
	}

}
