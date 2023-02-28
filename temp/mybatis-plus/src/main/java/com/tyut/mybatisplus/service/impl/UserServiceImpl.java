package com.tyut.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyut.mybatisplus.service.UserService;
import com.tyut.mybatisplus.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author 13106
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-02-28 14:56:44
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




