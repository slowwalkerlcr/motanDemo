package com.yks.rpc;

public class Main {
    public static void main(String args[]){
        IHelloService helloService = new HelloServiceImpl();
        RPCServer server = new RPCServer();
        server.register(helloService, 50001);
    }

}
