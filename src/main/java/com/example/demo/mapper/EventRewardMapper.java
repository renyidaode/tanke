package com.example.demo.mapper;

import com.example.demo.model.EventReward;
import com.example.demo.model.EventRewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EventRewardMapper {
    long countByExample(EventRewardExample example);

    int deleteByExample(EventRewardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EventReward record);

    int insertSelective(EventReward record);

    List<EventReward> selectByExample(EventRewardExample example);

    EventReward selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EventReward record, @Param("example") EventRewardExample example);

    int updateByExample(@Param("record") EventReward record, @Param("example") EventRewardExample example);

    int updateByPrimaryKeySelective(EventReward record);

    int updateByPrimaryKey(EventReward record);
}