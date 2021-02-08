package com.farben.chen.controller;

import com.farben.chen.dao.HbaseHive;
import com.farben.chen.server.ImpalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HbaseHiveController {
    @Autowired
    private ImpalaService impalaService;


    @PostMapping("/insert")
    public String insert(@RequestBody HbaseHive hbaseHive){
        System.out.println(hbaseHive);
        impalaService.insert(hbaseHive);
        return "insert success";
    }


}
