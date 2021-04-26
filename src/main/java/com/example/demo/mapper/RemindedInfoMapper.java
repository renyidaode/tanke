package com.example.demo.mapper;

import com.example.demo.model.RemindedInfo;
import com.example.demo.model.RemindedInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemindedInfoMapper {
    long countByExample(RemindedInfoExample example);

    int deleteByExample(RemindedInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(RemindedInfo record);

    int insertSelective(RemindedInfo record);

    List<RemindedInfo> selectByExample(RemindedInfoExample example);

    RemindedInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") RemindedInfo record, @Param("example") RemindedInfoExample example);

    int updateByExample(@Param("record") RemindedInfo record, @Param("example") RemindedInfoExample example);

    int updateByPrimaryKeySelective(RemindedInfo record);

    int updateByPrimaryKey(RemindedInfo record);
}