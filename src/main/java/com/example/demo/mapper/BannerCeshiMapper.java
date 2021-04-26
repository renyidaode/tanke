package com.example.demo.mapper;

import com.example.demo.model.BannerCeshi;
import com.example.demo.model.BannerCeshiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerCeshiMapper {
    long countByExample(BannerCeshiExample example);

    int deleteByExample(BannerCeshiExample example);

    int deleteByPrimaryKey(Integer bannerId);

    int insert(BannerCeshi record);

    int insertSelective(BannerCeshi record);

    List<BannerCeshi> selectByExample(BannerCeshiExample example);

    BannerCeshi selectByPrimaryKey(Integer bannerId);

    int updateByExampleSelective(@Param("record") BannerCeshi record, @Param("example") BannerCeshiExample example);

    int updateByExample(@Param("record") BannerCeshi record, @Param("example") BannerCeshiExample example);

    int updateByPrimaryKeySelective(BannerCeshi record);

    int updateByPrimaryKey(BannerCeshi record);
}