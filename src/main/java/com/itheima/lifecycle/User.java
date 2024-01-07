package com.itheima.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {

    public User() {
        System.out.println("2. User的构造方法执行了.........");
    }
    @Value("张三")
    private String name ;


    public void setName(String name) {
        System.out.println("setName方法执行了.........");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName方法执行了.........");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory方法执行了.........");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext方法执行了........");
    }

    @PostConstruct //相当于init-method，会在afterPropertiesSet方法之后执行
    public void init() {
        System.out.println("init方法执行了.................");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet方法执行了........");
    }

    @PreDestroy
    public void destory() {
        System.out.println("destory方法执行了...............");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}