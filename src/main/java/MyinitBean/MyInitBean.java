package MyinitBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
@Component
public class MyInitBean implements InitializingBean,DisposableBean {

    public MyInitBean(){
        System.out.println("MyInitBean.....construct");
    }

    // 当bean销毁时，调用此方法
    public void destroy() throws Exception {
        System.out.println("MyInitBean....destoury");
    }

    // 当我们的bena属性赋值和初始化完成
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyInitBean .....afterPropertiesSet");
    }
}
