package com.orechou.alfred.oauth2;

import com.orechou.alfred.domain.system.User;
import com.orechou.alfred.domain.system.UserToken;
import com.orechou.alfred.service.common.ShiroService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * 认证
 *
 * @author OreChou
 * @create 2018-01-14 18:35
 */
@Component
public class OAuth2Realm extends AuthorizingRealm {

    @Autowired
    ShiroService shiroService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof OAuth2Token;
    }

    /**
     * 授权(验证权限时调用)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User) principalCollection.getPrimaryPrincipal();
        // 获取用户权限列表
        Set<String> perms = shiroService.getUserPermissions(user.getUserId());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setStringPermissions(perms);
        return info;
    }

    /**
     * 认证（登陆时调用）
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String accessToken = (String) token.getPrincipal();
        UserToken userToken = shiroService.queryTokenByString(accessToken);
        if (userToken == null || userToken.getExpireTime().getTime() < System.currentTimeMillis()) {
            throw new IncorrectCredentialsException("token失效，请重新登录");
        }
        User user = shiroService.queryUserById(userToken.getUserId());
        if (user.getStatus() == 0) {
            throw new LockedAccountException("账号已被锁定,请联系管理员");
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, accessToken, getName());
        return info;
    }
}
