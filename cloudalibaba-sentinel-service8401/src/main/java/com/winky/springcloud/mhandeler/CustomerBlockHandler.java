package com.winky.springcloud.mhandeler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.winky.springcloud.entities.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult handlerException1(BlockException exception) {
        return new CommonResult(4444,"你点的太频繁了----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handelerException----2");
    }

    public static CommonResult handlerException3(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handelerException----3");
    }
    public static CommonResult javaException1(Throwable exception) {
        return new CommonResult(4445,"java内部代码出现异常----1");
    }
}
