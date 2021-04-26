package com.example.demo.dao;

import com.example.demo.model.Banner;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/*****
 *@className: EventDao
 *@date: 2021/4/25  16:43
 *@User: create By haha
 *
 */

@Mapper
public interface EventDao {

    List<Banner> queryEventList(@Param("index")Integer index,
                           @Param("size")Integer size,
                           @Param("title")String title,
                           @Param("bannerStatus")Integer eventStatus,
                           @Param("eventType")Integer eventType,
                           @Param("activeTime") Date startDatetime,
                           @Param("deactiveTime")Date endDatetime);

    Long queryEventListCount(@Param("title")String title,
                             @Param("bannerStatus")Integer eventStatus,
                             @Param("eventType")Integer eventType,
                             @Param("activeTime") Date startDatetime,
                             @Param("deactiveTime")Date endDatetime);
}
