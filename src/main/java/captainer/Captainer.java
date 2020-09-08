package captainer;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/25
 */
@Configuration
@Import({Dog.class,Cat.class,MyselectImport.class,MyImportBeanDefinitionRegister.class,MyFactoryBean.class})
public class Captainer {

    @Bean
    @Conditional(LinuxCondition.class)
    public Person lison(){
        System.out.println("添加一个lison");
        return new Person("lison",18);
    }

    @Bean
    @Conditional(WinCondition.class)
    public Person zhangsan(){
        System.out.println("添加一个zhangsan");
        return new Person("zhangsan",18);
    }

    @Bean
    public Person bitch(){
        System.out.println("添加一个bitch");
        return new Person("bitch",18);
    }

    @Bean
    public MyFactoryBean factoryBean(){
        System.out.println("添加一个MyFactoryBean");
        return new MyFactoryBean();
    }

}
