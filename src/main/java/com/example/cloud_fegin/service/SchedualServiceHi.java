package com.example.cloud_fegin.service;

import com.example.cloud_fegin.service.impl.SchedualServiceHiHysric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//2,增加回调,fallback =SchedualServiceHiHysric.class
@FeignClient(value = "service-hi",fallback =SchedualServiceHiHysric.class )
public interface SchedualServiceHi {


    @RequestMapping(value = "/hi", method = RequestMethod.POST)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
