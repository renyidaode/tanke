package com.example.demo.common;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

/*****
 *@className: Result
 *@date: 2021/3/26  15:47
 *@User: create By haha
 *
 */

@Data
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Result<T> implements Serializable {

    private Integer code;

    private String message;

    private T data;

    public Result(ResultCode resultCode){
        this.code = resultCode.code();
        this.message = resultCode.message();
    }

    public Result(ResultCode resultCode, T data){
        this.code = resultCode.code();
        this.message = resultCode.message();
        this.data = data;
    }
    public Result(ResultCode resultCode,String message, T data){
        this.code = resultCode.code();
        this.message = message==null||message==""?resultCode.message():message;
        this.data = data;
    }

    public static Result SUCCESS(){
        return new Result(ResultCode.SUCCESS);
    }

    public static <T> Result SUCCESS(T data){
        return new Result(ResultCode.SUCCESS, data);
    }

    public static Result FAIL(){
        return new Result(ResultCode.FAIL);
    }

    public static Result FAIL(String message){
        return new Result(ResultCode.FAIL,message,false);
    }

}
