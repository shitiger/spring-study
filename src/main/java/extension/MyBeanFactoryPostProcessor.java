package extension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/11
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("=======>>>>>>"+beanFactory.getBeanDefinitionNames().length);
        System.out.println(Arrays.asList(beanFactory.getBeanDefinitionNames()));
    }
}
