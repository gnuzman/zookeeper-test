package com.szhouse.zookeepertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZkController {


    @GetMapping("/zktest")
    public String zktest() {
        return "zktest";
    }

}
