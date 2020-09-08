package bean;

import bean.controller.ShihuController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/25
 */
public class MainTest {

    public static void main(String[] args) {
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
   /*        Person person = (Person)applicationContext.getBean("person");
        System.out.println(person);
        ShihuController shihuController = (ShihuController)applicationContext.getBean("shihuController");
        System.out.println(shihuController);

    ShihuController shihuController = (ShihuController)applicationContext.getBean("shihuController");
    System.out.println(shihuController);*/
        String[] names = applicationContext.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }

    }
}
