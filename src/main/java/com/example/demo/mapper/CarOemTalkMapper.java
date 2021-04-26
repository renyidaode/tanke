package com.example.demo.mapper;

import com.example.demo.model.CarOemTalk;
import com.example.demo.model.CarOemTalkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarOemTalkMapper {
    long countByExample(CarOemTalkExample example);

    int deleteByExample(CarOemTalkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CarOemTalk record);

    int insertSelective(CarOemTalk record);

    List<CarOemTalk> selectByExample(CarOemTalkExample example);

    CarOemTalk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CarOemTalk record, @Param("example") CarOemTalkExample example);

    int updateByExample(@Param("record") CarOemTalk record, @Param("example") CarOemTalkExample example);

    int updateByPrimaryKeySelective(CarOemTalk record);

    int updateByPrimaryKey(CarOemTalk record);
}