package com.winky.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @auther Li Wenjie
 * @create 2022-01-13 12:08
 */
@Service
public class PaymentService {

    /**
     * 正常访问肯定OK的方法
     *
     * @param id
     * @return
     */
    public String payment_OK(Integer id){
        return "线程池：" + Thread.currentThread().getName()+ "  payment_OK ,id =  " + id;
    }

    public String payment_WRONG(Integer id){
        int timeNumb = 3;
        try{
            TimeUnit.SECONDS.sleep(timeNumb);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "线程池：" + Thread.currentThread().getName()+
                "  payment_WRONG ,id =  " + id +  ",睡了：" +  timeNumb + "秒";
    }
}
