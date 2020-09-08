package extension;

import aop.AopConfig;
import aop.IMath;
import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/27
 */
public class ExTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExConfig.class);
        applicationContext.publishEvent(new String());
        Cattt cattt = applicationContext.getBean(Cattt.class);
        System.out.println(cattt);
        System.out.println("applicationContext》》》》》》》》》》》》》》》》》》"+applicationContext.getBeanDefinitionNames().length);
    }

}
