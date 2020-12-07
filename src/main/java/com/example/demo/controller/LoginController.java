package com.example.demo.controller;

import com.example.demo.filter.TokenAuthenticationFilter;
import com.example.demo.utils.R;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @PostMapping("login")
    public R login(@RequestParam String username, @RequestParam String password) {
        return R.ok().data("token","token");
    }

    @PostMapping("logout")
    public R logout(){
        return R.ok();
    }
}
