package MyinitBean;

import MyinitBean.SpringConfig2;
import beanLifiCircl.SpringConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
public class HHH {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig2.class);
        applicationContext.close();
    }

}
