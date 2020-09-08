package tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/9
 */
@Repository
public class TxDaoS {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void s1(){
        String sql  = "insert into bj_dispatch_tags(name,type) VALUES (?,?)";
        jdbcTemplate.update(sql,"shihu",3);
    }
}
