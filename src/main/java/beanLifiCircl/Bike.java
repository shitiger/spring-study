package beanLifiCircl;

import org.springframework.context.annotation.Lazy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
public class Bike {
    public Bike(){
        System.out.println("Bike construct");
    }


    public void initM(){
        System.out.println("Bike...init");
    }

    @PostConstruct
    public void initM2(){
        System.out.println("Bike...init2");
    }

    @PreDestroy
    public void destroyM(){
        System.out.println("Bike....destory");
    }

}
