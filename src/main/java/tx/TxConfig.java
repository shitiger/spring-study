package tx;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
@EnableTransactionManagement
@Configuration
@ComponentScan(value = "tx")
public class TxConfig {

    @Bean
    public DataSource dataSource(){
        DruidDataSource source = new DruidDataSource();
        source.setUsername("writer");
        source.setPassword("zhubajie");
        source.setDriverClassName("com.mysql.jdbc.Driver");
        source.setUrl("jdbc:mysql://mysql.test.zbjdev.com:3316/zhubajie_bj_dispatch_rule?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&&useSSL=false&&allowMultiQueries=true");
        return source;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public PlatformTransactionManager platformTransactionManager(){
        return new DataSourceTransactionManager(dataSource());
    }
}
