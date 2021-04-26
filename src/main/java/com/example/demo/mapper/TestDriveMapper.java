package com.example.demo.mapper;

import com.example.demo.model.TestDrive;
import com.example.demo.model.TestDriveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestDriveMapper {
    long countByExample(TestDriveExample example);

    int deleteByExample(TestDriveExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TestDrive record);

    int insertSelective(TestDrive record);

    List<TestDrive> selectByExample(TestDriveExample example);

    TestDrive selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TestDrive record, @Param("example") TestDriveExample example);

    int updateByExample(@Param("record") TestDrive record, @Param("example") TestDriveExample example);

    int updateByPrimaryKeySelective(TestDrive record);

    int updateByPrimaryKey(TestDrive record);
}