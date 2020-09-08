package captainer;


import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author stone tiger
 * @Description:ConditionContext 上下文内容
 * @date 2019/11/25
 */
public class WinCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 获取beanfactory
        ConfigurableListableBeanFactory configurableListableBeanFactory = conditionContext.getBeanFactory();
        Environment environment = conditionContext.getEnvironment();
        System.out.println(environment.getProperty("os.name"));
        if (environment.getProperty("os.name").contains("Windows")) return true;
        return false;
    }
}
