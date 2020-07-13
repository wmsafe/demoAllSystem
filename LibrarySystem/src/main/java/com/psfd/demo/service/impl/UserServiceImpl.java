package com.psfd.demo.service.impl;

import com.psfd.demo.entity.User;
import com.psfd.demo.mapper.UserMapper;
import com.psfd.demo.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-07-11
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
