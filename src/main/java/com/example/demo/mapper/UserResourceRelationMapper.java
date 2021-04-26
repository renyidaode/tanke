package com.example.demo.mapper;

import com.example.demo.model.UserResourceRelation;
import com.example.demo.model.UserResourceRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserResourceRelationMapper {
    long countByExample(UserResourceRelationExample example);

    int deleteByExample(UserResourceRelationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserResourceRelation record);

    int insertSelective(UserResourceRelation record);

    List<UserResourceRelation> selectByExample(UserResourceRelationExample example);

    UserResourceRelation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserResourceRelation record, @Param("example") UserResourceRelationExample example);

    int updateByExample(@Param("record") UserResourceRelation record, @Param("example") UserResourceRelationExample example);

    int updateByPrimaryKeySelective(UserResourceRelation record);

    int updateByPrimaryKey(UserResourceRelation record);
}