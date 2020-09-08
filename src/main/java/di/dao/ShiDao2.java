package di.dao;

import org.springframework.stereotype.Repository;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/25
 */
@Repository
public class ShiDao2 {

    private Integer s1 = 1;

    public Integer getS1() {
        return s1;
    }

    public void setS1(Integer s1) {
        this.s1 = s1;
    }
}
