package com.star.main;

import com.star.interfaces.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by hp on 2017/1/6.
 */
public class Main {
    public static void main(String[] args) {
        //Spring框架图中的Spring Context模块，作用是装载配置文件
        //FileSystemXmlApplicationContext是ApplicationContext的子类之一
        ApplicationContext atc=new FileSystemXmlApplicationContext("classpath:spring.xml");
        //也可以使用这个装载方式：
        //ApplicationContext atc=new ClassPathXmlApplicationContext("spring.xml");
        //面向接口编程，只使用接口，具体的实现类由Spring根据配置文件来装填。
        Hello hello= (Hello)atc.getBean("hello");
        System.out.println(hello.sayHello());
    }
}
