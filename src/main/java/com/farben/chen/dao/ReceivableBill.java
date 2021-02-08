package com.farben.chen.dao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReceivableBill {
    private String id;
    private String compantyId;
    private String companyName;
    private String chargeNo;
    private String chargeName;
    private String communityId;
    private String communityName;
    private String billDate;
    private String receivable;
    private String unpaid;
    private String paid;
    private String billNo;
    private String billingCycle;
}
