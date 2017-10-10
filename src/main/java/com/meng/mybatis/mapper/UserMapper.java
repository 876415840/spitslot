package com.meng.mybatis.mapper;

import com.meng.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author: 孟庆浩
 * @Description:测试mapper
 * @Date: Created in 17-10-9 下午4:16
 * @Modified By:
 */
@Mapper
public interface UserMapper {

    int insert(User user);

    List<User> listAll();
}
