package bean;

import bean.Person;
import bean.controller.ShihuController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/25
 */
// ComponentScan 默认的是 useDefaultFilters = true 默认扫描Component注解下面的所有  controller，service。Repository注解上都有Component
// 所以默扫描所有的，这个时候可以excludeFilters来排除，如果为false的话就不进行从默认扫描，需要include来添加。
@Configuration
@ComponentScan(value = "bean",excludeFilters = {
        @Filter(type = FilterType.ANNOTATION,value=Component.class),
        @Filter(type = FilterType.ASSIGNABLE_TYPE,value=ShihuController.class),
},useDefaultFilters = true)
public class BeanConfig {
    @Bean(value = "bitch")
    public Person person(){
        return new Person("shihu",18);
    }

}
