package com.lsqingfeng.action.test;

import com.lsqingfeng.action.WebApplication;
import com.lsqingfeng.action.common.redis.service.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebApplication.class)
public class RedisTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void test(){
        redisUtil.set("hello","hello");
    }




}





