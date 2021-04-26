package com.example.demo.exception;

import com.example.demo.common.Result;
import com.example.demo.common.ResultCode;
import org.springframework.http.HttpStatus;

import java.text.MessageFormat;

/*****
 *@className: CommonException
 *@date: 2021/4/23  17:46
 *@User: create By haha
 *
 */


public class CommonException extends RuntimeException{

    //错误代码
    ResultCode resultCode;

    int code;

    String message;

    public CommonException(ResultCode resultCode){
        super(resultCode.message());
        this.resultCode = resultCode;
    }

    public CommonException(ResultCode resultCode, Object... args){
        super(resultCode.message());
        String message = MessageFormat.format(resultCode.message(), args);
        resultCode.setMessage(message);
        this.resultCode = resultCode;
    }

    public CommonException(int resultCode, String message){
        this.code = resultCode;
        this.message = message;
    }

    public CommonException(String message){
        this.message = message;
    }

    public ResultCode getResultCode(){
        return resultCode;
    }
}
