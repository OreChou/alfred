package com.orechou.alfred.service.system.impl;

import com.orechou.alfred.domain.system.UserToken;
import com.orechou.alfred.dao.system.UserTokenMapper;
import com.orechou.alfred.service.system.UserTokenService;
import com.orechou.alfred.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户token 服务实现类
 * </p>
 *
 * @author OreChou
 * @since 2018-01-14
 */
@Service
public class UserTokenServiceImpl extends BaseServiceImpl<UserTokenMapper, UserToken> implements UserTokenService {

}
