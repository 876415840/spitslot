package com.meng.service;

import com.alibaba.fastjson.JSON;
import com.meng.entity.User;
import com.meng.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 孟庆浩
 * @Description:测试service
 * @Date: Created in 17-10-9 下午4:23
 * @Modified By:
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String listAll(){
        List<User> list = userMapper.listAll();
        return JSON.toJSONString(list);
    }
}
