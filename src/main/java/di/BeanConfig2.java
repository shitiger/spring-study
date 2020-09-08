package di;

import bean.Person;
import bean.controller.ShihuController;
import di.dao.ShiDao2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;


/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/25
 */
@Configuration
@ComponentScan(value = "di")
public class BeanConfig2 {

    @Bean
    public ShiDao2 shiDao2(){
        ShiDao2 shiDao2 = new ShiDao2();
        shiDao2.setS1(2);
        return shiDao2;
    }
}
