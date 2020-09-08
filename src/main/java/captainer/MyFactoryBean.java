package captainer;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
public class MyFactoryBean implements FactoryBean<Monkey> {
    public Monkey getObject() throws Exception {
        return new Monkey();
    }

    public Class<?> getObjectType() {
        return Monkey.class;
    }
    public boolean isSingleton() {
        return true;
    }
}
