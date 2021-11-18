package com.cloudiip.service;

import com.cloudiip.pojo.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {

    UserEntity login(Long userid, String password);
}
