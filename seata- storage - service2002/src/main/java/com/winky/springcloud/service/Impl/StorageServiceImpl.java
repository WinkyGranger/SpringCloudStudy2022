package com.winky.springcloud.service.Impl;

import com.winky.springcloud.dao.StorageDao;
import com.winky.springcloud.service.StorageService;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {
    @Resource
    StorageDao storageDao;

    @Override
    public int decrease(Long id, Long count) {
        return storageDao.decrease(id,count);
    }
}
