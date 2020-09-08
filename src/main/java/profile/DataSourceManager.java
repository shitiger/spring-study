package profile;

import MyinitBean.SpringConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/5
 */
public class DataSourceManager {

    @Test
    public void test12(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        applicationContext.getEnvironment().setActiveProfiles("test");
        applicationContext.register(ProfilConfig.class);
        applicationContext.refresh();
        for (String s1 :applicationContext.getBeanDefinitionNames())
        System.out.println(s1);
        applicationContext.close();
    }

}
