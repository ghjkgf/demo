package bilibili;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;

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
    }
}
