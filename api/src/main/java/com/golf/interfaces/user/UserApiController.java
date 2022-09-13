package com.golf.interfaces.user;

import com.golf.common.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {
    @Autowired
    private Config config;

    @GetMapping("/test")
    public int hello() {

        return config.getTest1();
    }
}
