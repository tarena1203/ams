package com.spring.boot.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zb.fincore.SpringBootStart;
import com.zb.fincore.facade.dto.AmsResp;
import com.zb.fincore.facade.model.FileInfoModel;
import com.zb.fincore.service.FileInfoService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpringBootStart.class)
public class SpringBootTests {
	
	@Autowired
	private FileInfoService fileInfoService;
	
	@Test
	public void queryFileInfoList() throws Exception {
		System.out.println("－－－>单元测试 start");
		AmsResp<List<FileInfoModel>> amsResp = fileInfoService.queryFileInfoList();
		//System.out.println("总记录："+ amsResp.getData().size());
		System.out.println("－－－>单元测试 end..");
	}

}
