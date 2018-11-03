package com.yks.demo;

public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return "Hello motan! I am "+name;
    }
}
