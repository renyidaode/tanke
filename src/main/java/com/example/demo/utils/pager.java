package com.example.demo.utils;

import lombok.Data;

import java.util.List;

/*****
 *@className: pager
 *@date: 2021/4/13  16:05
 *@User: create By haha
 *
 */

@Data
public class pager<T> {

    private Integer page;//分页起始页
    private Integer size;//每页条数
    private List<T> rows;//返回结合数据
    private long counts;//总条数
}
