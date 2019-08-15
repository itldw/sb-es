package com.example.sbes.controller;

import com.example.sbes.entry.User;
import com.example.sbes.service.UserReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:ldw
 * @Description
 * @Date ：Create in 17:13 2019/8/15
 * @Modified By :
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserReposity userReposity;


    @PostMapping("/addUser")
    public  ResponseEntity addUser(@RequestBody(required = true)  User user){

        return   ResponseEntity.ok(userReposity.save(user));
    }
}
