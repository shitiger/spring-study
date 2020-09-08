package extension;

import org.springframework.stereotype.Component;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/12/11
 */
@Component
public class Sunshine {
    static {
        System.out.println("construct=====");
    }
}
