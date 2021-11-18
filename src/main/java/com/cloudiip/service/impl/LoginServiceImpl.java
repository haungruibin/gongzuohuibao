package com.cloudiip.service.impl;

import com.cloudiip.mapper.LoginMapper;
import com.cloudiip.pojo.entity.UserEntity;
import com.cloudiip.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author haungruibin
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public UserEntity login(Long userid, String password) {

        return loginMapper.login(userid, password);
    }

}
