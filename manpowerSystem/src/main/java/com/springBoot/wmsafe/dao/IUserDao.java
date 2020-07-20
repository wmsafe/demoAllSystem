package com.springBoot.wmsafe.dao;

import com.springBoot.wmsafe.model.Users;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface IUserDao {

    @Select("SELECT * FROM users WHERE id = #{id}")
    Users selectUser(@Param("id") int id);

    Users login(HashMap loginInfo);
    void addUser(Users user);
    List<Users> selectAllUser();
    boolean deleteUser(Integer id);
}