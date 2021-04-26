package com.example.demo.service.impl;

import com.example.demo.builder.bannerBuilder;
import com.example.demo.common.ResultCode;
import com.example.demo.dao.BannerDao;
import com.example.demo.domain.requestDto.bannerInfoRequest;
import com.example.demo.domain.requestDto.bannerOnlineOffRequest;
import com.example.demo.domain.requestDto.bannerRequest;
import com.example.demo.domain.responseDto.bannerInfoResponse;
import com.example.demo.domain.responseDto.bannerResponse;
import com.example.demo.enums.EventTypeEnum;
import com.example.demo.enums.bannerTypeEnum;
import com.example.demo.exception.CustomException;
import com.example.demo.mapper.BannerMapper;
import com.example.demo.mapper.EventMapper;
import com.example.demo.model.Banner;
import com.example.demo.model.Event;
import com.example.demo.service.BannerService;
import com.example.demo.utils.ForEachUtils;
import com.example.demo.utils.pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/*****
 *@className: bannerServiceImpl
 *@date: 2021/4/20  16:14
 *@User: create By haha
 *
 */

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerDao bannerDao;

    @Autowired
    private BannerMapper bannerMapper;

    @Autowired
    private bannerBuilder builder;

    @Autowired
    private EventMapper eventMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addOrUpdate(bannerRequest request) {
        if (request.getId() == null || request.getId() == 0){
                bannerMapper.insert(builder.toEntity(request));
        }else{
            if (request != null){
                bannerMapper.updateByPrimaryKeySelective(builder.toEntity(request));
            }
        }
    }

    @Override
    public bannerResponse preview(Long id) {
        Banner banner = bannerMapper.selectByPrimaryKey(id);
        return builder.toDto(banner);
    }

    @Override
    public pager<bannerInfoResponse> getBannerList(bannerInfoRequest bannerRequest) {
        Integer index = (bannerRequest.getPage() - 1) * bannerRequest.getSize();
        pager<bannerInfoResponse> responsepager = new pager<>();
        Integer bannerStatus = null;
        if (bannerRequest.getBannerStatus() != null){
            bannerStatus = bannerRequest.getBannerStatus().getCode();
        }
        List<Banner> banners = bannerDao.queryList(index, bannerRequest.getSize(), bannerRequest.getTitle(),
                 bannerStatus, bannerRequest.getActiveTime(), bannerRequest.getDeactiveTime());
        if (banners != null && banners.size() > 0){
            List<bannerInfoResponse> bannerInfoResponses = builder.toInfosDto(banners);
            responsepager.setRows(bannerInfoResponses);
            responsepager.setPage(bannerRequest.getPage());
            responsepager.setSize(bannerRequest.getSize());
            responsepager.setCounts(bannerDao.queryListCount(bannerRequest.getTitle(),
                    bannerStatus, bannerRequest.getActiveTime(), bannerRequest.getDeactiveTime()));
        }else {
            responsepager.setRows(null);
            responsepager.setPage(bannerRequest.getPage());
            responsepager.setSize(bannerRequest.getSize());
        }
        return responsepager;
    }

    @Override
    public void deleted(Long id) {
        bannerDao.deleted(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void onlineOfflineBannerInfo(bannerOnlineOffRequest request) {
        //查询出要上线的banner
        Banner banners = bannerMapper.selectByPrimaryKey(request.getBannerId());
        //判断接收到的banner的活动数据是否是跳转活动类型
        Event event1 = null;
        Date date = new Date();
        if (banners != null) {
            if (bannerTypeEnum.event.equals(bannerTypeEnum.getByCode(banners.getType()))) {
                //查询出banner的跳转活动类型的活动
                event1 = eventMapper.selectByPrimaryKey(banners.getEventId());
            }
            switch (request.getOnlineOffStatus()) {
                //判读出banner的上线状态是什么状态
                case on_line:
                // 立即上线--判断
                    if (banners.getActiveStatus()){
                        throw new CustomException(ResultCode.ONLINE_ON_IN);
                    }
                    if (!banners.getActiveStatus() && banners.getDeactiveTime() == null){
                        if (banners.getTimedDeactiveTime() != null){
                            if (date.after(banners.getTimedDeactiveTime())){
                                throw new CustomException(ResultCode.ACTIVETIME_GREATER_DEACTIVETime);
                            }
                        }
                    }
                    // 获取所有正在上线的banner
                    List<Banner> bannerList = bannerDao.onlineList();
                    if (bannerList.size() >= 6){
                        throw new CustomException(ResultCode.BANNER_SIZE_SIX);
                    }
                    for (Banner banner:bannerList){
                        if (bannerTypeEnum.event.equals(bannerTypeEnum.getByCode(banner.getType()))){
                            Event event2 = eventMapper.selectByPrimaryKey(banner.getEventId());
                            if (event1 != null && event2 != null){
                                if (EventTypeEnum.getByCode(event1.getEventType()).equals(EventTypeEnum.getByCode(event2.getEventType()))){
                                    throw new CustomException(ResultCode.ACTIVITY_TYPE_NOT_SAME);
                                }
                            }
                        }
                    }
                    banners.setActiveStatus(true);
                    banners.setActiveTime(date);
                    banners.setDeactiveTime(null);
                    banners.setTimedDeactiveTime(null);
                    break;

                case TimeOnline: //预约上线
                    //预约上线判定
                    if (banners.getActiveStatus()){
                        throw new CustomException(ResultCode.ONLINE_ON_IN);
                    }
                    if (!banners.getActiveStatus() && banners.getDeactiveTime() == null){
                        if (request.getPrim().before(date)){
                            throw new CustomException(ResultCode.TimeOnline_LINE_TIME);
                        }
                        if (banners.getTimedDeactiveTime() != null){
                            if (request.getPrim().after(banners.getTimedDeactiveTime())){
                                throw new CustomException(ResultCode.ACTIVETIME_GREATER_DEACTIVETime);
                            }
                        }
                    }
                    // 获取正在上线的所有banner
                    List<Banner> bannerList1 = bannerDao.onlineList();
                    //获取所有未上线的banner
                    List<Banner> bannerList2 = bannerDao.notReleaseList();
                    // 获取正在上线并且没有定时下线时间的所有banner
                    List<Banner> bannerList3 = bannerList1.stream()
                            .filter(x -> x.getTimedDeactiveTime() == null)
                            .collect(Collectors.toList());
                    // 获取正在上线并且有定时下线时间的banner，判断定时上线时间小于传来的定时上线时间并且小于定时下线时间的banner
                    List<Banner> bannerList4 = bannerList1.stream()
                            .filter(x -> x.getTimedDeactiveTime() != null && x.getActiveTime().after(x.getTimedDeactiveTime()))
                            .collect(Collectors.toList());
                    // 查询有定时上线时间，没有定时下线时间的
                    List<Banner> bannerList5 = bannerList2.stream()
                            .filter(x -> x.getTimedActiveTime() != null && x.getTimedDeactiveTime() == null)
                            .collect(Collectors.toList());
                    // 获取有定时上线时间，有定时下线时间，传入定时上线时间比较
                    List<Banner> bannerList6 = bannerList2.stream()
                            .filter(x -> x.getTimedActiveTime() != null && x.getTimedDeactiveTime() != null && x.getTimedActiveTime().before(x.getTimedDeactiveTime()))
                            .collect(Collectors.toList());
                    if (bannerList3.size() + bannerList4.size() + bannerList5.size() + bannerList6.size() >= 6){
                        throw new CustomException(ResultCode.Banner_Max_Six);
                    }
                    //判断-四种banner跳转类型是否为活动
                    for (Banner banner:bannerList3){
                        if (bannerTypeEnum.event.equals(bannerTypeEnum.getByCode(banner.getType()))){
                            Event event2 = eventMapper.selectByPrimaryKey(banner.getEventId());
                            if (event1 != null && event2 != null){
                                if (EventTypeEnum.getByCode(event1.getEventType()).equals(EventTypeEnum.getByCode(event2.getEventType()))){
                                    throw new CustomException(ResultCode.ACTIVITY_TYPE_NOT_SAME);
                                }
                            }
                        }
                    }

                    for (Banner banner:bannerList4){
                        if (bannerTypeEnum.event.equals(bannerTypeEnum.getByCode(banner.getType()))){
                            Event event2 = eventMapper.selectByPrimaryKey(banner.getEventId());
                            if (event1 != null && event2 != null){
                                if (EventTypeEnum.getByCode(event1.getEventType()).equals(EventTypeEnum.getByCode(event2.getEventType()))){
                                    throw new CustomException(ResultCode.ACTIVITY_TYPE_NOT_SAME);
                                }
                            }
                        }
                    }

                    for (Banner banner:bannerList5){
                        if (bannerTypeEnum.event.equals(bannerTypeEnum.getByCode(banner.getType()))){
                            Event event2 = eventMapper.selectByPrimaryKey(banner.getEventId());
                            if (event1 != null && event2 != null){
                                if (EventTypeEnum.getByCode(event1.getEventType()).equals(EventTypeEnum.getByCode(event2.getEventType()))){
                                    throw new CustomException(ResultCode.ACTIVITY_TYPE_NOT_SAME);
                                }
                            }
                        }
                    }

                    for (Banner banner:bannerList6){
                        if (bannerTypeEnum.event.equals(bannerTypeEnum.getByCode(banner.getType()))){
                            Event event2 = eventMapper.selectByPrimaryKey(banner.getEventId());
                            if (event1 != null && event2 != null){
                                if (EventTypeEnum.getByCode(event1.getEventType()).equals(EventTypeEnum.getByCode(event2.getEventType()))){
                                    throw new CustomException(ResultCode.ACTIVITY_TYPE_NOT_SAME);
                                }
                            }
                        }
                    }
                    banners.setTimedActiveTime(request.getPrim());
                    banners.setActiveTime(null);
                    break;

                case off_line: //立即下线
                    if (!banners.getActiveStatus()){
                        throw new CustomException(ResultCode.OFFLINE_ON_IN);
                    }
                    if (!banners.getActiveStatus() && banners.getDeactiveTime() == null){
                        throw new CustomException(ResultCode.Not_release_ISNOT_Offline);
                    }
                    if (!banners.getActiveStatus() && banners.getDeactiveTime() != null){
                        throw new CustomException(ResultCode.OFFLINE_ON_IN);
                    }
                    banners.setDeactiveTime(new Date());
                    banners.setActiveStatus(false);
                    banners.setTimedDeactiveTime(null);
                    banners.setTimedActiveTime(null);
                    break;

                case TimeOffline: //定时下线
                    if (banners.getActiveStatus()){
                        if (request.getPrim().before(banners.getActiveTime())){
                            throw new CustomException(ResultCode.TimeOfflineTime_Less_OnlineTime);
                        }
                    }
                    if (!banners.getActiveStatus()){
                        throw new CustomException(ResultCode.OFFLINE_ON_IN);
                    }
                    if (!banners.getActiveStatus() && banners.getDeactiveTime() == null && banners.getTimedActiveTime() != null){
                        if (request.getPrim().before(banners.getTimedActiveTime())){
                            throw new CustomException(ResultCode.TimeOfflineTime_Less_TimeOnlineTime);
                        }
                    }
                    banners.setTimedDeactiveTime(request.getPrim());
                    banners.setDeactiveTime(null);
                default:
            }
        }
        bannerMapper.updateByPrimaryKeySelective(banners);
    }
}
