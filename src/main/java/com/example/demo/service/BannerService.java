package com.example.demo.service;

import com.example.demo.domain.requestDto.bannerInfoRequest;
import com.example.demo.domain.requestDto.bannerOnlineOffRequest;
import com.example.demo.domain.requestDto.bannerRequest;
import com.example.demo.domain.responseDto.bannerInfoResponse;
import com.example.demo.domain.responseDto.bannerResponse;
import com.example.demo.utils.pager;

/*****
 *@className: bannerService
 *@date: 2021/4/20  15:51
 *@User: create By haha
 *
 */


public interface BannerService {

    //新增或修改
    void addOrUpdate(bannerRequest request);

    //预览
    bannerResponse preview(Long id);

    //分页查询（名称、状态、时间）
    pager<bannerInfoResponse> getBannerList(bannerInfoRequest bannerRequest);

    //删除
    void deleted(Long id);

    //上、下线
    void onlineOfflineBannerInfo(bannerOnlineOffRequest request);
}
