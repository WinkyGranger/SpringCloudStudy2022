package com.winky.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageDao {
    int decrease(@Param("id") Long id,@Param("count") Long count);
}
