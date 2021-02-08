package com.farben.chen.mapper;


import com.farben.chen.dao.HbaseHive;
import org.springframework.stereotype.Repository;



@Repository
public interface HbaseHiveMapper {
    void insertData(HbaseHive hbaseHive);
}
