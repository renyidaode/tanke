package com.example.demo.timing;

import com.example.demo.common.ResultCode;
import com.example.demo.dao.BannerDao;
import com.example.demo.exception.CommonException;
import com.example.demo.exception.CustomException;
import com.example.demo.model.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

/*****
 *@className: TimingTaskController
 *@date: 2021/4/25  11:43
 *@User: create By haha
 *
 */

@Configuration
@EnableScheduling
public class TimingTaskController {

    @Autowired
    private BannerDao bannerDao;

    /**
     * banner定时上线
     */
    @Scheduled(cron = "*/5 * * * * ?")
    private void bannerOnlineTask(){
        List<Banner> banners = bannerDao.timeOnlineList();
        if (banners != null && banners.size() > 0){
            for (Banner banner:banners){
                List<Banner> bannerList = bannerDao.onlineList();
                if (bannerList.size() >= 6){
                    throw new CommonException(ResultCode.BANNER_SIZE_SIX);
                }else {
                    banner.setActiveTime(banner.getTimedActiveTime());
                    banner.setActiveStatus(true);
                    banner.setDeactiveTime(null);
                    banner.setTimedDeactiveTime(null);
                }
            }
        }
    }


}
