package com.example.demo.mapper;

import com.example.demo.model.EventCar;
import com.example.demo.model.EventCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventCarMapper {
    long countByExample(EventCarExample example);

    int deleteByExample(EventCarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EventCar record);

    int insertSelective(EventCar record);

    List<EventCar> selectByExample(EventCarExample example);

    EventCar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EventCar record, @Param("example") EventCarExample example);

    int updateByExample(@Param("record") EventCar record, @Param("example") EventCarExample example);

    int updateByPrimaryKeySelective(EventCar record);

    int updateByPrimaryKey(EventCar record);
}