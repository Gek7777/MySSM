package com.MySSM.service.impl;

import com.MySSM.dao.IUserDao;
import com.MySSM.model.User;
import com.MySSM.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }
}
