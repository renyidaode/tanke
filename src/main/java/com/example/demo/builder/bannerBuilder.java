package com.example.demo.builder;
import com.example.demo.domain.requestDto.bannerRequest;
import com.example.demo.domain.responseDto.bannerInfoResponse;
import com.example.demo.domain.responseDto.bannerResponse;
import com.example.demo.model.Banner;

import java.util.List;

/*****
 *@className: BannerBuilder
 *@date: 2021/4/1  14:51
 *@User: create By haha
 *
 */


public interface bannerBuilder {

    Banner toEntity(bannerRequest request);

    bannerResponse toDto(Banner banner);

    bannerInfoResponse toInfoDto(Banner banner);
    List<bannerInfoResponse> toInfosDto(List<Banner> bannerList);

}
