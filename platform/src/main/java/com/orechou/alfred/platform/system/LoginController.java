package com.orechou.alfred.platform.system;

import com.orechou.alfred.pojo.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登陆的控制器
 *
 * @author OreChou
 * @create 2018-01-14 23:35
 */
@RestController
@RequestMapping(value = {"/sys"})
public class LoginController {

    @GetMapping(value = {"/login"})
    public Response login() {
        return Response.success("登陆成功");
    }

    @GetMapping(value = {"/logout"})
    public Response logout() {
        return Response.success("登出成功");
    }

}
