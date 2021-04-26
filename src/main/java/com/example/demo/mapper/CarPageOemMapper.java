package com.example.demo.mapper;

import com.example.demo.model.CarPageOem;
import com.example.demo.model.CarPageOemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarPageOemMapper {
    long countByExample(CarPageOemExample example);

    int deleteByExample(CarPageOemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CarPageOem record);

    int insertSelective(CarPageOem record);

    List<CarPageOem> selectByExample(CarPageOemExample example);

    CarPageOem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CarPageOem record, @Param("example") CarPageOemExample example);

    int updateByExample(@Param("record") CarPageOem record, @Param("example") CarPageOemExample example);

    int updateByPrimaryKeySelective(CarPageOem record);

    int updateByPrimaryKey(CarPageOem record);
}