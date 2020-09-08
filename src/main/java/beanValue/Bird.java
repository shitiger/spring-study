package beanValue;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/26
 */
public class Bird {

    @Value("${follow.masterdb.user}")
    private String name;

    private Integer age;

    Bird(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
