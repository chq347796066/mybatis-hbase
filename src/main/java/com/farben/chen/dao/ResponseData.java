package com.farben.chen.dao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@ToString
@AllArgsConstructor
@Getter
@Setter
public class ResponseData<T> {
    private String errorCode;
    private String message;
    private T data;
}
