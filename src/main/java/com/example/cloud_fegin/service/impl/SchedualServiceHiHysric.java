package com.example.cloud_fegin.service.impl;

import com.example.cloud_fegin.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

//3,增加实现类
@Component
public class SchedualServiceHiHysric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
