package com.cloud.betterconsumer.controller;

import com.cloud.betterconsumer.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;/*需要在启动类上边new一个*/

    @Value("${user.uerServicePath}")
    private String uerServicePath;

    @GetMapping("/movie/{id}")
    public User findById(@PathVariable Long id){
        /*return this.restTemplate.getForObject("http://127.0.0.1:7900/simple/"+id,User.class);
       */
        return this.restTemplate.getForObject(this.uerServicePath+id,User.class);


        /*地址是变动的!!!!!*/

    }
}
