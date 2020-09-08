package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/5
 */
@Service("math")
@Transactional
public class Math implements IMath {

    @Autowired
    private Caculator caculator;

    @Override
    public void cal(int i, int j) {
        System.out.println(i/j);
    }
}
