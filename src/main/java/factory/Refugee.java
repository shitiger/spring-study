package factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/29
 */
@Service
public class Refugee implements FactoryBean<Dsb> {
    @Override
    public Dsb getObject() throws Exception {
        Dsb dsb = new Dsb();
        System.out.println(dsb);
        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        return dsb;
    }


    public Class<?> getObjectType() {
        return Dsb.class;
    }
}
