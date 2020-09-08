package di;

import MyinitBean.SpringConfig2;
import bean.BeanConfig;
import di.dao.ShiDao2;
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
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig2.class);
        ShiDao2 shiDao2 =(ShiDao2) applicationContext.getBean("shiDao2");
        System.out.println(shiDao2.getS1());
        applicationContext.close();
    }

}
