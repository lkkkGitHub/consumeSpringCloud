package lk.simplecloud_consum.controller;

import lk.simplecloud_consum.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author lk
 * 2019/4/13 20:57
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findOne")
    public TbUser findOne(Integer id) {
        return restTemplate.getForObject("http://localhost:8080/user/findUser?id=" + id, TbUser.class);
    }
}
