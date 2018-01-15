package com.restful.mybatis.mapper;

import com.restful.mybatis.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by yuanqiang on 2018/1/15.
 */
public interface UserMapper {

    public List<User> findUserAll();

    @Select("select * from user where id=#{id}")
    @Results({
            @Result(id=true,property="id",column="id",javaType=String.class),
            @Result(property="username",column="username",javaType=String.class),
            @Result(property="password",column="password",javaType=String.class)
    })
    public User login(@Param("id")String id);

    public User findUserById();

}
