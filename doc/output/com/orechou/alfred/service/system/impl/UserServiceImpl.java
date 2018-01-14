package com.orechou.alfred.service.system.impl;

import com.orechou.alfred.domain.system.User;
import com.orechou.alfred.dao.system.UserMapper;
import com.orechou.alfred.service.system.UserService;
import com.orechou.alfred.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author OreChou
 * @since 2018-01-14
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

}
