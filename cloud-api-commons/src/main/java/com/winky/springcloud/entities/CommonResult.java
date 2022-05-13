package com.winky.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @auther Li Wenjie
 * @create 2022-01-03 13:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;    //404
    private String message;  //not found
    private T data;

    public CommonResult(Integer code,String message){
        this.code = code;
        this.message = message;
    }


}
