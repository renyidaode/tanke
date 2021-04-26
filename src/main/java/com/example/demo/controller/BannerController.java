package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.common.ResultCode;
import com.example.demo.domain.requestDto.bannerInfoRequest;
import com.example.demo.domain.requestDto.bannerOnlineOffRequest;
import com.example.demo.domain.requestDto.bannerRequest;
import com.example.demo.domain.responseDto.bannerInfoResponse;
import com.example.demo.domain.responseDto.bannerResponse;
import com.example.demo.exception.CommonException;
import com.example.demo.service.BannerService;
import com.example.demo.utils.DateUtil;
import com.example.demo.utils.pager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/*****
 *@className: BannerController
 *@date: 2021/4/1  14:50
 *@User: create By haha
 *
 */

@RestController
@RequestMapping("/banner")
@Slf4j
public class BannerController {

    @Autowired
    private BannerService bannerService;

    @PostMapping("/add")
    private ResponseEntity<Result> insetBanner(@RequestBody bannerRequest request){
        try {
            bannerService.addOrUpdate(request);
            return new ResponseEntity<>(Result.SUCCESS(), HttpStatus.OK);
        } catch (Exception e) {
            log.error("新增失败", DateUtil.getTime(), e);
            return new ResponseEntity<>(new Result(ResultCode.FAIL, e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/preview")
    private ResponseEntity<Result> preview(@RequestParam Long id){
        try{
            bannerResponse banner = bannerService.preview(id);
            return new ResponseEntity<>(Result.SUCCESS(banner), HttpStatus.OK);
        }catch (Exception e){
            log.error("查询失败", DateUtil.getTime(), e);
            return new ResponseEntity<>(new Result(ResultCode.FAIL, e.getMessage()), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/getList")
    private ResponseEntity<Result> getList(bannerInfoRequest request){
        try {
            pager<bannerInfoResponse> response = bannerService.getBannerList(request);
            return new ResponseEntity<>(Result.SUCCESS(response), HttpStatus.OK);
        }catch (Exception e){
            log.error("条件查询失败", e);
            return new ResponseEntity<>(new Result(ResultCode.FAIL, ResultCode.FAIL.message() ), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/deleted/{id}")
    private ResponseEntity<Result> deleted(@PathVariable Long id){
        try {
            bannerService.deleted(id);
            return new ResponseEntity<>(Result.SUCCESS(), HttpStatus.OK);
        }catch (Exception e){
            log.error("条件查询失败", e);
            return new ResponseEntity<>(new Result(ResultCode.FAIL, ResultCode.FAIL.message() ), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/onlineOroffline")
    private ResponseEntity<Result> onlineOfflineBannerInfo(bannerOnlineOffRequest request){
        try {
            bannerService.onlineOfflineBannerInfo(request);
            return new ResponseEntity<>(Result.SUCCESS(), HttpStatus.OK);
        }catch (CommonException e){
            return new ResponseEntity<>(new Result(e.getResultCode(), e.getMessage()), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(new Result(ResultCode.FAIL, ResultCode.FAIL.message()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
