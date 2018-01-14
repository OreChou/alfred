package com.orechou.alfred.platform.system;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.orechou.alfred.pojo.Response;

/**
 * 测试控制器
 *
 * @author OreChou
 * @create 2018-01-12 下午3:51
 */
@RestController
@RequestMapping(value = {"/test"})
public class TestController {

    @GetMapping("/hello")
    public Response hello() {
        return Response.success("hello");
    }

    @GetMapping("/test1")
    public Response test1() throws Exception {
        throw new Exception();
    }

}
