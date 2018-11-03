package com.yks.rpc;

public class RPCClient {
    public static void main(String args[]) {
        IHelloService helloService = new ProxyHandler().getClient(IHelloService.class, "127.0.0.1", 50001);
        System.out.println(helloService.hello("lvcr! I am from rpc call"));
    }

}
