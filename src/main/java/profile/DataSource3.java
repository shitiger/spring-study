package profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/5
 */
@Repository
@Profile("product")
public class DataSource3 {

    private String name ="product";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
