package factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/29
 */
public class Refugee2 implements FactoryBean<Dsb> {
    @Override
    public Dsb getObject() throws Exception {
        Dsb dsb = new Dsb();
        System.out.println(dsb);
        return dsb;
    }


    public Class<?> getObjectType() {
        return Dsb.class;
    }
}
