package com.akasaka.blog.Controller;

import com.akasaka.blog.dao.pojo.SysUser;
import com.akasaka.blog.utils.UserThreadLocal;
import com.akasaka.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
