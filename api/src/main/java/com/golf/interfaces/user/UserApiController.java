package com.golf.interfaces.user;

import com.golf.test.Sample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController {
    @GetMapping("/test")
    public Sample hello() {
        Sample sample = new Sample();
        sample.setId(1L);
        sample.setName("sangwoo");

        return sample;
    }
}
