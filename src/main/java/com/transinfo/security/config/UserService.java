package com.transinfo.security.config;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.transinfo.security.dao.RoleMapper;
import com.transinfo.security.dao.UserMapper;
import com.transinfo.security.entity.Role;
import com.transinfo.security.entity.security.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    UserMapper usermapper;
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println(s);
        com.transinfo.security.entity.User user = usermapper.selectOne(new QueryWrapper<com.transinfo.security.entity.User>().eq("USER_NAME",s ));

        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        //此处会被父类捕获,从而变成BadCredentialsException,我们可以直接抛出这个异常或者抛出自定义异常
        System.out.println("s:"+s);
        System.out.println("username:"+user.getUserName()+";password:"+user.getPassWord());
        Role role = roleMapper.selectById(user.getRoleId());
        //System.out.println(passwordEncoder.encode(user.getPassWord()));

        return new User(
                user.getUserName(),
//                user.getPassWord(),
                user.getPassWord(),
                true,// 是否可用
                true,// 账号是否过期
                true,// 密码是否过期
                true,// 账号没有被锁定标志,以上四个均默认为true
                AuthorityUtils.commaSeparatedStringToAuthorityList(role.getRoleName()));    }
}
