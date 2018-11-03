package com.yks.rpc;

public class HelloServiceImpl implements IHelloService {
    @Override
    public String hello(String name) {
        return "Hello, " + name;
    }
}
