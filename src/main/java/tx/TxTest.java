package tx;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/9
 */
@Repository
public class TxTest {

    @Test
    public void sas9(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        ITxSercie txService = (ITxSercie) applicationContext.getBean("txSercie");
        txService.s1();
    }


}
