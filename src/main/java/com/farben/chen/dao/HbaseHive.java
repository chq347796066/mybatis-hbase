package com.farben.chen.dao;





public class HbaseHive {
    private String key;
    private String buyerMobile;

    public HbaseHive(String key, String buyerMobile) {
        this.key = key;
        this.buyerMobile = buyerMobile;
    }

    public HbaseHive(){}

    public void setKey(String key) {
        this.key = key;
    }

    public void setBuyerMobile(String buyerMobile) {
        this.buyerMobile = buyerMobile;
    }

    public String getKey() {
        return key;
    }

    public String getBuyerMobile() {
        return buyerMobile;
    }
}
