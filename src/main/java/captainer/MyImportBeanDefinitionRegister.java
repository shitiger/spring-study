package captainer;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author stone tiger
 * @Description: AnnotationMetadata 当前类的注解信息
 * BeanDefinitionRegistry 注册类
 * @date 2019/11/26
 */
@Component
public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition(Fish.class);
        beanDefinitionRegistry.registerBeanDefinition("fish22",beanDefinition);
    }
}
