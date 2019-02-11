package com.transinfo.security;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.transinfo.security.dao.UserMapper;
import com.transinfo.security.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SecurityApplicationTests {

    @Autowired
    UserMapper userMapper;
    @Test
    public void contextLoads() {
        User user = userMapper.selectOne(new QueryWrapper<User>().eq("USER_NAME","admin"));
        System.out.println(user.getPassWord());
    }

}

