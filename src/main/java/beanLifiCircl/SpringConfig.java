package beanLifiCircl;

import bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
@Configuration
public class SpringConfig {

    @Bean
    public Person person(){
        System.out.println("add person in cap");
        return new Person("lisi",12);
    }

    @Bean(initMethod = "initM")
    public Bike myBike(){
        System.out.println("add Bike in cap");
        return new Bike();
    }
}
