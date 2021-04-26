package com.example.demo.mapper;

import com.example.demo.model.BannerBrowseDetail;
import com.example.demo.model.BannerBrowseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BannerBrowseDetailMapper {
    long countByExample(BannerBrowseDetailExample example);

    int deleteByExample(BannerBrowseDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BannerBrowseDetail record);

    int insertSelective(BannerBrowseDetail record);

    List<BannerBrowseDetail> selectByExample(BannerBrowseDetailExample example);

    BannerBrowseDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BannerBrowseDetail record, @Param("example") BannerBrowseDetailExample example);

    int updateByExample(@Param("record") BannerBrowseDetail record, @Param("example") BannerBrowseDetailExample example);

    int updateByPrimaryKeySelective(BannerBrowseDetail record);

    int updateByPrimaryKey(BannerBrowseDetail record);
}