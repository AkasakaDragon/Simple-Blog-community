package com.akasaka.blog.Controller;

import com.akasaka.blog.service.LoginService;
import com.akasaka.blog.vo.Result;
import com.akasaka.blog.service.LoginService;
import com.akasaka.blog.vo.Result;
import com.akasaka.blog.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("logout")
public class LogoutController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public Result logout(@RequestHeader("Authorization") String token){

        return loginService.logout(token);
    }
}
