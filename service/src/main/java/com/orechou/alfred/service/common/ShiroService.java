package com.orechou.alfred.service.common;

import com.orechou.alfred.domain.system.User;
import com.orechou.alfred.domain.system.UserToken;

import java.util.Set;

/**
 * Shiro的服务类
 *
 * @author OreChou
 * @create 2018-01-14 18:41
 */
public interface ShiroService {

    /**
     * 获取用户的权限集
     * @param userId
     * @return
     */
    Set<String> getUserPermissions(Long userId);

    /**
     * 通过token字符串获取UserToken
     * @param tokenStr
     * @return
     */
    UserToken queryTokenByString(String tokenStr);

    /**
     * 获取用户
     * @param userId
     * @return
     */
    User queryUserById(Long userId);

}
