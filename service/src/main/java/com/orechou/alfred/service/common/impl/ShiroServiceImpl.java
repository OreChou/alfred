package com.orechou.alfred.service.common.impl;

import com.orechou.alfred.domain.system.User;
import com.orechou.alfred.domain.system.UserToken;
import com.orechou.alfred.service.common.ShiroService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Shiro服务类接口的实现
 *
 * @author OreChou
 * @create 2018-01-14 18:43
 */
@Service
public class ShiroServiceImpl implements ShiroService {
    @Override
    public Set<String> getUserPermissions(Long userId) {
        return null;
    }

    @Override
    public UserToken queryTokenByString(String tokenStr) {
        return null;
    }

    @Override
    public User queryUserById(Long userId) {
        return null;
    }
}
