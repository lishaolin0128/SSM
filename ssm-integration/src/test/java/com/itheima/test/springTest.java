package com.itheima.test;


import com.itheima.service.UserService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class springTest {

    @Autowired
    UserService userService;

   /* @Test
    public void test(){
        userService.findAll();
    }*/
}
