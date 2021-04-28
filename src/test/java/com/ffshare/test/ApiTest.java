package com.ffshare.test;


import com.ffshare.test.apiCases.HelloApi;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 *  API 接口函数测试
 * @author Mark
 * @version 1.0
 * @date 2021/4/28
 */
@SpringBootTest
public class ApiTest {

    @Autowired
    HelloApi helloApi;

    @Test
    void say(){
        helloApi.say();
    }
}
