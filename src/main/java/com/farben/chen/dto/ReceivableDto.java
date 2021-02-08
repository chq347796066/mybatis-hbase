package com.farben.chen.dto;


import lombok.Data;

import java.util.Stack;

@Data
public class ReceivableDto {
    private String compantyId;
    private String communityId;
    private String chargeNo;
    private String startDate;
    private String endDate;
    private Integer pageSize;
    private Integer pageNum;


}
