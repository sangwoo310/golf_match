package com.golf.common;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Config {
    @Value("${val1.wow}")
    private int test1;

//    @Override
//    public void onApplicationEvent(ApplicationStartedEvent event) {
//
//    }
}
