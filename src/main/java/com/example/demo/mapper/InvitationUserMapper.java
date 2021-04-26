package com.example.demo.mapper;

import com.example.demo.model.InvitationUser;
import com.example.demo.model.InvitationUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvitationUserMapper {
    long countByExample(InvitationUserExample example);

    int deleteByExample(InvitationUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(InvitationUser record);

    int insertSelective(InvitationUser record);

    List<InvitationUser> selectByExample(InvitationUserExample example);

    InvitationUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") InvitationUser record, @Param("example") InvitationUserExample example);

    int updateByExample(@Param("record") InvitationUser record, @Param("example") InvitationUserExample example);

    int updateByPrimaryKeySelective(InvitationUser record);

    int updateByPrimaryKey(InvitationUser record);
}