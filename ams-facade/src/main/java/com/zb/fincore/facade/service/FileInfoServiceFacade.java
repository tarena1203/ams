package com.zb.fincore.facade.service;

import java.util.List;

import com.zb.fincore.facade.dto.AmsResp;
import com.zb.fincore.facade.model.FileInfoModel;

/**
 * 
* @ClassName: FileInfoServiceFacade 
* @Description: 133
* @author zs
* @date 2018年10月2日 下午10:42:29 
*
 */
public interface FileInfoServiceFacade {

	/**
	 * 
	* @Title: queryFileInfoList 
	* @Description: 444
	* @param @return
	* @param @throws Exception 
	* @return BaseResponse<List<FileInfoModel>>
	* @throws
	 */
	public AmsResp<List<FileInfoModel>> queryFileInfoList() throws Exception;
}
