package com.springBoot.wmsafe.service;

import com.springBoot.wmsafe.dao.IUserDao;
import com.springBoot.wmsafe.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private IUserDao userDao;

    public Users selectUser(int userId){
        return userDao.selectUser(userId);
    }
    public Users login(HashMap loginInfo) {
        return null;
    }
    public void addUser(Users user){

    }
    public List<Users> selectAllUser(){
        return null;
    }
    public boolean deleteUser(Integer id){
        return true;
    }
}