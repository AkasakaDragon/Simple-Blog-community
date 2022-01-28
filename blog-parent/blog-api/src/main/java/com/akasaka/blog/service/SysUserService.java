package com.akasaka.blog.service;

import com.akasaka.blog.dao.pojo.SysUser;
import com.akasaka.blog.vo.Result;
import com.akasaka.blog.vo.UserVo;
import org.springframework.stereotype.Service;

public interface SysUserService {

    UserVo findUserVoById(Long id);

    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    /**
     * 根据token查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    /**
     * 根据账号查询用户
     * @param account
     * @return
     */
    SysUser findUserByAccount(String account);

    /**
     * 保存用户
     * @param sysUser
     */
    void save(SysUser sysUser);
}
