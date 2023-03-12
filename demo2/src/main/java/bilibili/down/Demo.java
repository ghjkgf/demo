package bilibili.down;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zsl
 * @date 2023/3/12
 * @apiNote
 */

@Slf4j
public class Demo implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("ghjkgf");
        System.out.println("1233454");
    }
    public Demo(){
        System.out.println("zsl");
    }
}
