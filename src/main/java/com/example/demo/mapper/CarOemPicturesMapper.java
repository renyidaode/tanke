package com.example.demo.mapper;

import com.example.demo.model.CarOemPictures;
import com.example.demo.model.CarOemPicturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarOemPicturesMapper {
    long countByExample(CarOemPicturesExample example);

    int deleteByExample(CarOemPicturesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CarOemPictures record);

    int insertSelective(CarOemPictures record);

    List<CarOemPictures> selectByExample(CarOemPicturesExample example);

    CarOemPictures selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CarOemPictures record, @Param("example") CarOemPicturesExample example);

    int updateByExample(@Param("record") CarOemPictures record, @Param("example") CarOemPicturesExample example);

    int updateByPrimaryKeySelective(CarOemPictures record);

    int updateByPrimaryKey(CarOemPictures record);
}