package com.itheima.lifecycle;


import com.itheima.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class UserTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = ctx.getBean(User.class);
        System.out.println(user);

    }



}