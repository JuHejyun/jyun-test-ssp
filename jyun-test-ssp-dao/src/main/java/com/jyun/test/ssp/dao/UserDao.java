package com.jyun.test.ssp.dao;


import com.jyun.test.ssp.domain.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}