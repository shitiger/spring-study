package aop;

import beanValue.SpringConfig3;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/27
 */
public class AopTest {

    @Test
    public void test(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
   //     ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("122");
          //    String[] strings = applicationContext.getBeanDefinitionNames();
      /*  for (String name : strings){
            System.out.println(name);
        }*/
          IMath caculator =(IMath)applicationContext.getBean("math");
          caculator.cal(1,2);
    }

}
