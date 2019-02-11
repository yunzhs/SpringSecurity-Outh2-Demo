package com.transinfo.security.service.impl;

import com.transinfo.security.entity.User;
import com.transinfo.security.dao.UserMapper;
import com.transinfo.security.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author gyw
 * @since 2019-01-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
