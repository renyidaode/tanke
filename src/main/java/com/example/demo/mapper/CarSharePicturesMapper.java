package com.example.demo.mapper;

import com.example.demo.model.CarSharePictures;
import com.example.demo.model.CarSharePicturesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarSharePicturesMapper {
    long countByExample(CarSharePicturesExample example);

    int deleteByExample(CarSharePicturesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CarSharePictures record);

    int insertSelective(CarSharePictures record);

    List<CarSharePictures> selectByExample(CarSharePicturesExample example);

    CarSharePictures selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CarSharePictures record, @Param("example") CarSharePicturesExample example);

    int updateByExample(@Param("record") CarSharePictures record, @Param("example") CarSharePicturesExample example);

    int updateByPrimaryKeySelective(CarSharePictures record);

    int updateByPrimaryKey(CarSharePictures record);
}