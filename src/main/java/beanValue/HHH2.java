package beanValue;

import MyinitBean.SpringConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
public class HHH2 {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig3.class);
       String[] arr = applicationContext.getBeanDefinitionNames();
       for (String s1 : arr){
           System.out.println(s1);
       }
       Bird bird = (Bird)applicationContext.getBean("bird");
       System.out.println(bird);
        applicationContext.close();
    }

}
