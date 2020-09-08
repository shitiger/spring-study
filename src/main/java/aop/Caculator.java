package aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/27
 */
@Component
public class Caculator {

    @Autowired
    private IMath math2;

    public int div(int i,int j){
        return i / j;
    }

    public void sa12(){
        System.out.println(math2);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> caculator =  Class.forName("aop.Caculator");
        Caculator caculator1 = (Caculator) caculator.newInstance();
        System.out.println(caculator1);
    }
}
