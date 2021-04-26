package com.example.demo.mapper;

import com.example.demo.model.UserCeshi;
import com.example.demo.model.UserCeshiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserCeshiMapper {
    long countByExample(UserCeshiExample example);

    int deleteByExample(UserCeshiExample example);

    int deleteByPrimaryKey(Integer idUser);

    int insert(UserCeshi record);

    int insertSelective(UserCeshi record);

    List<UserCeshi> selectByExample(UserCeshiExample example);

    UserCeshi selectByPrimaryKey(Integer idUser);

    int updateByExampleSelective(@Param("record") UserCeshi record, @Param("example") UserCeshiExample example);

    int updateByExample(@Param("record") UserCeshi record, @Param("example") UserCeshiExample example);

    int updateByPrimaryKeySelective(UserCeshi record);

    int updateByPrimaryKey(UserCeshi record);
}