package factory;

import MyinitBean.SpringConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/29
 */
public class TestFactory {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfigFactory.class);
      //  for (String s1 : applicationContext.getBeanDefinitionNames()) System.out.println(s1);
      //  Refugee refugee =(Refugee) applicationContext.getBean("&refugee");
        System.out.println(Refugee.class);
        Dsb refugee2 =(Dsb) applicationContext.getBean("refugee");
        Refugee refugee3 =(Refugee) applicationContext.getBean(Refugee.class);

        //    Dsb refugee2 = applicationContext.getBean(Dsb.class);
  //     System.out.println(refugee2);
        System.out.println(refugee3);

     //   System.out.println(refugee);
        applicationContext.close();
    }

}
