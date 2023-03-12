package com.example.demo.spi;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @Author: heling
 * @Date: 2020/3/8 20:59
 * @Description:
 */
@Configuration
@Data
public class MyConfig {

    @Bean
    @ConditionalOnMissingBean
    public SpiDemo spiDemo() {
        return new SpiDemo();
    }
}
