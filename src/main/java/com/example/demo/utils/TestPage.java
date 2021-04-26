package com.example.demo.utils;//package com.example.demo.utils;
//
//import com.example.demo.builder.bannerBuilder;
//import com.example.demo.dao.BannerDao;
//import com.example.demo.dto.displayDto.bannerDto;
//import com.example.demo.entity.Banner;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.ArrayList;
//import java.util.List;
//
///*****
// *@className: TestPage
// *@date: 2021/4/2  15:55
// *@User: create By haha
// *
// */
//
//
//public class TestPage {
//
//    @Autowired
//    private BannerDao bannerDao;
//
//    @Autowired
//    private bannerBuilder builder;
//
//    public PageInfo<bannerDto> getAllStudent(Integer pageNum, Integer pageSize) {
//        // 1. 开启分页
//        PageHelper.startPage(pageNum, pageSize);
//        // 2. 从数据库中查询出
//        List<Banner> banners = bannerDao.queryAll();
//        // 3. 这一步的作用主要是为了获取分页信息
//        PageInfo bannersPageInfo = new PageInfo<>(banners);
//        // 4. 创建需要分页的VoList
//        List<bannerDto> studentVos = new ArrayList<>();
//        // 5. 对象转换
//        List<bannerDto> dto = builder.displaytoDto(banners);
//        // 6.这一步的作用是将封装后的列表放到分页对象中
//        studentDoPageInfo.setList(studentVos);
//        return studentDoPageInfo;
//    }
//}
