package org.example.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: kj
 * @Date: 2022/09/02/17:14
 */
@Component
@PropertySource("classpath:jdbc.properties")
@Data
//@EnableTransactionManagement
public class Config {
    @Value("${name}")
    private String name;
}
