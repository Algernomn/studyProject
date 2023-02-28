package com.tyut.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tyut.mybatisplus.mapper.UserMapper;
import com.tyut.mybatisplus.pojo.User;
import com.tyut.mybatisplus.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class UserTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService userService;

    /**
     * 查询出年龄大于20并且姓名中包含的有'o'或者邮箱地址为空的记录
     */
    @Test
    public void query() {
        Page<User> page=new Page<>(2,5);
        Page<User> userPage = userMapper.selectPage(page, null);
        System.out.println("userPage.getCurrent() = " + userPage.getCurrent());
        System.out.println("userPage.getPages() = " + userPage.getPages());
        System.out.println("userPage.getTotal() = " + userPage.getTotal());
        List<User> records = userPage.getRecords();
        records.forEach(System.out::println);
        System.out.println("userPage.getSize() = " + userPage.getSize());
        System.out.println("userPage.hasNext() = " + userPage.hasNext());
        System.out.println("userPage.hasPrevious() = " + userPage.hasPrevious());

    }
}
