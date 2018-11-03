package com.yks.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MotanClient {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(Constants.zk_xml);
        IHelloService helloService = (IHelloService) ctx.getBean("helloService");
        System.out.println(helloService.sayHello("lvcr"));
    }
}
