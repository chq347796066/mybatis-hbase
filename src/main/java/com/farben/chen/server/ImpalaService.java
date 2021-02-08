package com.farben.chen.server;


import com.farben.chen.dao.HbaseHive;
import com.farben.chen.mapper.HbaseHiveMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ImpalaService {
    @Autowired
    private HbaseHiveMapper hbaseHiveMapper;


    public void insert(HbaseHive hbaseHive){
        hbaseHiveMapper.insertData(hbaseHive);
    }
}
