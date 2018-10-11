package com.zb.fincore.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zb.fincore.model.FileInfo;

@Mapper
public interface FileInfoDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ams_file_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ams_file_info
     *
     * @mbggenerated
     */
    int insert(FileInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ams_file_info
     *
     * @mbggenerated
     */
    int insertSelective(FileInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ams_file_info
     *
     * @mbggenerated
     */
    FileInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ams_file_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(FileInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ams_file_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(FileInfo record);
    
    /**
     * 查询文件列表
     * @return
     */
    List<FileInfo> queryFileInfoList();
}