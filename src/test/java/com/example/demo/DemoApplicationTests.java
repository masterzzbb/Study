package com.example.demo;

import com.example.demo.dao.UserDAO;
import com.example.demo.pojo.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
class DemoApplicationTests {

    @Autowired
    private UserDAO userDAO;


    @Test
    void contextLoads() {
        List<UserDO> users = userDAO.listUsers();
        System.out.println(users);
    }

    @Test
    void testGetUsersByName(){
        List<UserDO> users = userDAO.getUsersByName("三哥");
       log.info(users.toString());
    }

}
