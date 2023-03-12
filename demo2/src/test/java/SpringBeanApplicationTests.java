import bilibili.down.config.AppConfig;
import bilibili.down.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeanApplicationTests {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean("myBean");
        ApplicationContext context2 = new AnnotationConfigApplicationContext(Config.class);
        context2.getBean("autoDemo");
    }
}