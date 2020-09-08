package extension;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/11
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("11111");
        Cattt cattt = new Cattt();
        RootBeanDefinition rootBeanDefinition =  new RootBeanDefinition(cattt.getClass());
        registry.registerBeanDefinition("cattt",rootBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("=======222>>>>>>"+beanFactory.getBeanDefinitionNames().length);
        System.out.println(Arrays.asList(beanFactory.getBeanDefinitionNames()));
    }
}
