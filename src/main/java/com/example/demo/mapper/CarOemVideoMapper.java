package com.example.demo.mapper;

import com.example.demo.model.CarOemVideo;
import com.example.demo.model.CarOemVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarOemVideoMapper {
    long countByExample(CarOemVideoExample example);

    int deleteByExample(CarOemVideoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CarOemVideo record);

    int insertSelective(CarOemVideo record);

    List<CarOemVideo> selectByExample(CarOemVideoExample example);

    CarOemVideo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CarOemVideo record, @Param("example") CarOemVideoExample example);

    int updateByExample(@Param("record") CarOemVideo record, @Param("example") CarOemVideoExample example);

    int updateByPrimaryKeySelective(CarOemVideo record);

    int updateByPrimaryKey(CarOemVideo record);
}