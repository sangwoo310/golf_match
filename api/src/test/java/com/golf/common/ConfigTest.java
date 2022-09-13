package com.golf.common;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class ConfigTest {
    @Autowired
    private Config config;

    @Test
    public void getK() {
        Assert.isTrue(config.getTest1() == 100);
    }
}
