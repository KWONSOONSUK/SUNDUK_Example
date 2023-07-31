package com.flns.sunduk.conf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.flns.sunduk.mapper") // Set the base package for MyBatis mappers
public class MyBatisConfig {
}
