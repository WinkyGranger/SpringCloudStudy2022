package com.winky.springcloud;

import java.time.ZonedDateTime;

public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);

        //2022-01-17T19:44:51.812+08:00[Asia/Shanghai]
    }
}
