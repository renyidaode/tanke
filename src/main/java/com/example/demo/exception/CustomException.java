package com.example.demo.exception;

import com.example.demo.common.ResultCode;
import lombok.Data;

import java.text.MessageFormat;

/*****
 *@className: CustomException
 *@date: 2021/3/29  17:08
 *@User: create By haha
 *
 */

@Data
public class CustomException extends RuntimeException{

    ResultCode resultCode;

    private Integer code;

    public CustomException(ResultCode resultCode){
        super(resultCode.message());
        this.code = resultCode.code();
    }

    public CustomException(ResultCode resultCode, Object... args){
        super(resultCode.message());
        String message = MessageFormat.format(resultCode.message(), args);
        resultCode.setMessage(message);
        this.resultCode = resultCode;
    }
}
