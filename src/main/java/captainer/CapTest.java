package captainer;

import bean.BeanConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/25
 */
public class CapTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Captainer.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
        Fish monkey = (Fish) applicationContext.getBean("fish22");
     //   Dog s = (Dog) applicationContext.getBean("dog");

       System.out.println(monkey);
    }

}
