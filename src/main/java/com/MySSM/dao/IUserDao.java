package com.MySSM.dao;

import com.MySSM.model.User;

public interface IUserDao {

    User selectUser(long id);

}