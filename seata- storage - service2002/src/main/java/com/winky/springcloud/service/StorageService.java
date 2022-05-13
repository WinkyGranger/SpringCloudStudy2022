package com.winky.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;


public interface StorageService {
    int decrease(@Param("id") Long id, @Param("count") Long count);
}
