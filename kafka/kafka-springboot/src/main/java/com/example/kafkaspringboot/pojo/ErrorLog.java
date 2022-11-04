package com.example.kafkaspringboot.pojo;

import lombok.Data;

/**
 * @Author: kj
 * @Date: 2022/11/02/15:11
 */
@Data
public class ErrorLog {
    private String methodName;
    private String errorMsg;
}
