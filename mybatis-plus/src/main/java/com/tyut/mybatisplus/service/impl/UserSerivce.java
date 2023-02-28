package com.tyut.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tyut.mybatisplus.mapper.UserMapper;
import com.tyut.mybatisplus.pojo.User;
import com.tyut.mybatisplus.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author Yangql
 * @Date 2023/2/27 11:22
 * @Version 1.0
 */
@Service
public class UserSerivce extends ServiceImpl<UserMapper, User>  implements IUserService {
}
