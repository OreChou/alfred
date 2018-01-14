package com.orechou.alfred.oauth2;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * OAuth2 Token
 *
 * @author OreChou
 * @create 2018-01-14 18:36
 */
public class OAuth2Token implements AuthenticationToken {
    private String token;

    public OAuth2Token(String token){
        this.token = token;
    }

    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
