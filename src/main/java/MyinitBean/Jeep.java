package MyinitBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
@Component
public class Jeep {

    static {
        System.out.println(111111);
    }

    public Jeep(){
        System.out.println("Jeep ..... constructors");
    }

    @PostConstruct
    public void inits(){
        while (true)
        System.out.println("inits .....JEEP");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy .....JEEP");
    }
}
