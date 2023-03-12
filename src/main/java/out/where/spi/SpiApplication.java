package out.where.spi;

import bilibili.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpiApplication.class, args);
        Demo bean = context.getBean(Demo.class);
        System.out.println("why");

    }

}
