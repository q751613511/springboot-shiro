package com.shiro;

import com.shiro.mapper.UserMapper;
import com.shiro.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiroSpringbootApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    void contextLoads() {
        User user = userMapper.queryUserByName("czd");
        System.out.println(user.getPassword());
    }

}
