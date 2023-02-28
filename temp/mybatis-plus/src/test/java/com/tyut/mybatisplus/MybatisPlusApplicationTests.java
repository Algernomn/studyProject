package com.tyut.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tyut.mybatisplus.mapper.UserMapper;
import com.tyut.mybatisplus.pojo.User;
import com.tyut.mybatisplus.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusApplicationTests {


    @Autowired
    private UserMapper userMapper;


    void queryUser() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }


    void addUser() {
        User user2 = new User();
        user2.setAge(19);
        user2.setName("algernon");
        user2.setEmail("1310699584@163.com");
        userMapper.insert(user2);
    }


    void updateUser() {
        User user = new User();
        user.setAge(66);
        user.setId(1630032593465241602L);
        user.setName("老王2");
        userMapper.updateById(user);
    }
    @Autowired
    private IUserService userService;

    @Test
    void save() {
        User user = new User();
        user.setAge(66);
        user.setName("老婆");
        boolean save = userService.save(user);
        System.out.println("save = " + save);
    }

}
