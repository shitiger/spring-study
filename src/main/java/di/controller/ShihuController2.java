package di.controller;

import di.dao.ShiDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author stone tiger
 * @Description:
 * @date 2019/11/25
 */
@Controller
public class ShihuController2 {

    @Resource(name = "shiDao2")
    private ShiDao2 shiDao2;

    private ShiDao2 shiDao3;

    @Autowired
    ShihuController2(@Autowired ShiDao2 shiDao3){
        this.shiDao3 = shiDao3;
    }

    @PostConstruct
    public void ss(){
        System.out.println(shiDao2);
    }

}
