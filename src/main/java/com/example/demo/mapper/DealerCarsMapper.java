package com.example.demo.mapper;

import com.example.demo.model.DealerCars;
import com.example.demo.model.DealerCarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DealerCarsMapper {
    long countByExample(DealerCarsExample example);

    int deleteByExample(DealerCarsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DealerCars record);

    int insertSelective(DealerCars record);

    List<DealerCars> selectByExample(DealerCarsExample example);

    DealerCars selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DealerCars record, @Param("example") DealerCarsExample example);

    int updateByExample(@Param("record") DealerCars record, @Param("example") DealerCarsExample example);

    int updateByPrimaryKeySelective(DealerCars record);

    int updateByPrimaryKey(DealerCars record);
}