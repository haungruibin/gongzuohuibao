package com.cloudiip.mapper;

import com.cloudiip.pojo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : xutinghao
 * @date : 2021/11/16 17:22
 * @description :
 */

public interface LoginMapper {

    public UserEntity login(@Param("userid") Long userid,@Param("password") String password);
}
