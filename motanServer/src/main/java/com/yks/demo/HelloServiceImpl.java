package com.yks.demo;

public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        System.out.println(" server1 message  ...");
       int i=1/0;
        return "Hello "+name+" I am form server1";
    }
}
