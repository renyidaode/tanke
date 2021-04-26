package com.example.demo.dao;
import com.example.demo.model.Banner;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/*****
 *@className: BannerDao
 *@date: 2021/4/1  11:52
 *@User: create By haha
 *
 */

@Mapper
public interface BannerDao {

    List<Banner> queryList(@Param("index")Integer index,
                           @Param("size")Integer size,
                           @Param("title")String title,
                           @Param("bannerStatus")Integer bannerStatus,
                           @Param("activeTime")Date activeTime,
                           @Param("deactiveTime")Date deactiveTime);

    Long queryListCount(@Param("title")String title,
                        @Param("bannerStatus")Integer bannerStatus,
                        @Param("activeTime")Date activeTime,
                        @Param("deactiveTime")Date deactiveTime);

    //查询在线banner
//    List<Banner> selectOnlineBanner();

    //删除
    void deleted(@Param("id")Long id);

    //查询立即上线
    List<Banner> onlineList();

    //查询立即下线
    List<Banner> notReleaseList();

    //查询预约上线
    List<Banner> timeOnlineList();
}
