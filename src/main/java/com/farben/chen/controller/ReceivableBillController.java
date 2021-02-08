package com.farben.chen.controller;


import com.farben.chen.dao.ReceivableBill;
import com.farben.chen.dao.ResponseData;
import com.farben.chen.dto.ReceivableDto;
import com.farben.chen.mapper.ReceivableBillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReceivableBillController {

    @Autowired
    private ReceivableBillMapper receivableBillMapper;

    @PostMapping("/selectReceivableBill")
    public ResponseData queryReceivableBill(@RequestBody ReceivableDto receivableDto){
        if(receivableDto==null){
            return new ResponseData("1001","参数错误",null);
        }
        Integer pageNum=receivableDto.getPageNum();
        Integer pageSize=receivableDto.getPageSize();
        if(pageNum == null||pageSize==null||pageNum<=0||pageSize<=0){
            return new ResponseData("1001","参数错误",null);
        }
        int offset=(pageNum-1)*pageSize+1;
        receivableDto.setPageNum(offset);
        List<ReceivableBill>receivableBills= receivableBillMapper.selectReceivableBill(receivableDto);
        return new ResponseData("0","成功",receivableBills);
    }




}
