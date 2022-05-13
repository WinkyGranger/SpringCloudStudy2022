package com.winky.springcloud.controller;

import com.winky.springcloud.domain.CommonResult;
import com.winky.springcloud.service.StorageService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StorageController {

    @Autowired
    StorageService storageService;

    @RequestMapping("/storage/decrease/{id}/{count}")
    public CommonResult decrease(@PathVariable("id") Long id, @PathVariable("count") Long count){

        int a = storageService.decrease(id,count);
        if(a == 1){
            return new CommonResult(200,"库存修改成功");
        }else{
            return new CommonResult(400,"库存修改失败");
        }
    }
}
