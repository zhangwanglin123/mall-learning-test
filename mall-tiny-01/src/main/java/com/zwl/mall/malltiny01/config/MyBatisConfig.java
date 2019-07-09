package com.zwl.mall.malltiny01.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@MapperScan("com.zwl.mall.tiny.mbg.mapper")
public class MyBatisConfig {
}
