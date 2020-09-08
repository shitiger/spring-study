package beanValue;

import MyinitBean.MyBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
@Configuration
@PropertySource(value = "development.properties")
public class SpringConfig3 {

    @Bean
    public Bird bird(){
        return new Bird();
    }
}
