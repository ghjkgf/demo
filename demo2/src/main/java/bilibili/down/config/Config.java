package bilibili.down.config;

import bilibili.down.Demo;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author zsl
 * @date 2023/3/12
 * @apiNote
 */
@Configuration
public class Config {
    @Bean
    @ConditionalOnMissingBean
    public Demo autoDemo(){
        return new Demo();
    }
}
