package com.example.demo.builder.impl;

import com.example.demo.builder.bannerBuilder;
import com.example.demo.domain.requestDto.bannerRequest;
import com.example.demo.domain.responseDto.bannerInfoResponse;
import com.example.demo.domain.responseDto.bannerResponse;
import com.example.demo.enums.bannerStatusEnum;
import com.example.demo.enums.bannerTypeEnum;
import com.example.demo.mapper.EventMapper;
import com.example.demo.model.Banner;
import com.example.demo.model.Event;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/*****
 *@className: BannerBuilderImpl
 *@date: 2021/4/1  14:53
 *@User: create By haha
 *
 */

@Service
public class bannerBuilderImpl implements bannerBuilder {

    @Override
    public Banner toEntity(bannerRequest request) {
        Banner banner = new Banner();
        BeanUtils.copyProperties(request, banner);
        return banner;
    }

    @Override
    public bannerResponse toDto(Banner banner) {
        bannerResponse response = new bannerResponse();
        BeanUtils.copyProperties(banner, response);
        if (banner.getType() != null){
            bannerTypeEnum code = bannerTypeEnum.getByCode(banner.getType());
            response.setType(code);
        }
        return response;
    }

    @Override
    public bannerInfoResponse toInfoDto(Banner banner) {
        bannerInfoResponse response = new bannerInfoResponse();
        if (banner != null){
            BeanUtils.copyProperties(banner, response);
//            response.setClicksPv(bannerDao.selectClickPv(banners.getId()));
//            response.setClicksUv(bannerDao.selectClickUv(banners.getId()));
            if (banner.getActiveStatus()) {
                response.setBannerStatus(bannerStatusEnum.on_line);
            }
            if (!banner.getActiveStatus() && banner.getDeactiveTime() == null){
                response.setBannerStatus(bannerStatusEnum.not_release);
            }
            if (!banner.getActiveStatus() && banner.getDeactiveTime() != null){
                response.setBannerStatus(bannerStatusEnum.off_line);
            }
            if (banner.getType() != null){
                bannerTypeEnum byCode = bannerTypeEnum.getByCode(banner.getType());
                response.setBannerType(byCode);
            }
        }
        return response;
    }

    @Override
    public List<bannerInfoResponse> toInfosDto(List<Banner> bannerList) {
        return bannerList.stream().map(e->toInfoDto(e)).collect(Collectors.toList());
    }
}
