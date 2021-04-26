package com.example.demo.mapper;

import com.example.demo.model.TalkLike;
import com.example.demo.model.TalkLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalkLikeMapper {
    long countByExample(TalkLikeExample example);

    int deleteByExample(TalkLikeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TalkLike record);

    int insertSelective(TalkLike record);

    List<TalkLike> selectByExample(TalkLikeExample example);

    TalkLike selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TalkLike record, @Param("example") TalkLikeExample example);

    int updateByExample(@Param("record") TalkLike record, @Param("example") TalkLikeExample example);

    int updateByPrimaryKeySelective(TalkLike record);

    int updateByPrimaryKey(TalkLike record);
}