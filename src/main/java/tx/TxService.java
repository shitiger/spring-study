package tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/9
 */
@Service("txSercie")
@Transactional
public class TxService implements ITxSercie{

    @Autowired
    private TxDaoS txDaoS;


    public void s1(){
        System.out.println("insert data");
        txDaoS.s1();
        System.out.println(1/0);
    }

    public void s2(){
        System.out.println("insert data");
        txDaoS.s1();
        System.out.println(1/0);
    }
}
