package com.example.demo.mapper;

import com.example.demo.model.UserReward;
import com.example.demo.model.UserRewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserRewardMapper {
    long countByExample(UserRewardExample example);

    int deleteByExample(UserRewardExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserReward record);

    int insertSelective(UserReward record);

    List<UserReward> selectByExample(UserRewardExample example);

    UserReward selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserReward record, @Param("example") UserRewardExample example);

    int updateByExample(@Param("record") UserReward record, @Param("example") UserRewardExample example);

    int updateByPrimaryKeySelective(UserReward record);

    int updateByPrimaryKey(UserReward record);
}